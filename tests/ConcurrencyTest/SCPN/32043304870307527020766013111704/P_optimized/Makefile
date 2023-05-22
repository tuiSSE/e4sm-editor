####################################################################
# Makefile in GnuMake (gmake) format

SOURCES = $(wildcard *.cpp) 
OBJECTS = $(patsubst %.cpp,%.o,$(SOURCES))
TARGET = P_optimized.exe
# -Wl = pass option to linker
# -Bstatic = linker option to use .a library
# -Bdynamic = use .so library
#LIBS = -LC:\TimeNET\Development\TimeNET/lib -lSimulation -lxerces-c -lsal -lrandgen -Wl,-Bstatic -lgc -Wl,-Bdynamic -lodbc
#LIBS = -Wl,-verbose -Wl,-enable-stdcall-fixup -Wl,-enable-auto-import -Wl,--enable-runtime-pseudo-reloc -L"C:\TimeNET\Development\TimeNET/lib" -lSCPN -lsal -lrandgen -lgc -lodbc32 -lws2_32 -lxerces-c25
LIBS = -Wl,-enable-auto-import -L"C:\TimeNET\Development\TimeNET/lib" -L"C:\TimeNET\Development\TimeNET/Vendor/bin" -lSCPN_win -lsal_win -lRandGen_win -lgc -lodbc32 -lws2_32 -lxerces-c
INCLUDES = -I"C:\TimeNET\Development\TimeNET/SCPN/include" \
  -I"C:\TimeNET\Development\TimeNET/Vendor/EcuyerRandGen/include" \
	-I"C:\TimeNET\Development\TimeNET/Vendor/SAL/include" \
	-I"C:\TimeNET\Development\TimeNET/Vendor/SmartPointers" \
	-I"C:\TimeNET\Development\TimeNET/Vendor/gcollector/bdwgc/include" \
	-I"C:\TimeNET\Development\TimeNET/Vendor/xercesc/src" \
	-I"C:\TimeNET\Development\TimeNET/Vendor"

####################################################################
CXX = g++ # Gnu C++ compiler name

#-------------------------------------------------------------------
# Flags for the c++ compiler
CXXFLAGS = -g -Wall -Wno-unused -Wno-unknown-pragmas
CXXNOFLAGS = -g -Wall -Wno-unknown-pragmas

# Flags for the C preprocessor
CPPFLAGS =   -D__MINGW32__ $(INCLUDES)

#-------------------------------------------------------------------
# Flags for the linker

LDFLAGS = -D__MINGW32__ $(LIBS)

# Phony targets
.PHONY: all clean mrproper depend

all: $(TARGET)

clean:
	rm -f $(OBJECTS) $(TARGET)

mrproper: clean
	rm -f *~ .depend

depend: .depend

test:	all
	./$(TARGET) FROMTO `hostname`:4444 12:00:00@01/01/2003 $(basename $(TARGET)).log
#	./$(TARGET) FROMTO `hostname`:4444 12:00:00@01/01/2003 12:00:00@02/02/2003 $(basename $(TARGET)).log

####################################################################
# Explicit rules

$(TARGET): $(OBJECTS)
	$(CXX) $^ $(LDFLAGS) -o $@

buildnet.o: buildnet.cpp
	$(CXX) $(CXXNOFLAGS) $(CPPFLAGS) -c -o $@ $<

.depend: $(SOURCES)
# For each source, let the compiler run the preprocessor with the -M and -MM
# options, which causes it to output a dependency suitable for make.
	@echo -n "Generating dependencies ..."
	@for source in $^ ; do \
		$(CXX) $(CXXFLAGS) $(CPPFLAGS) -MM $$source; \
	done > $@
	@echo " done."

# Include the generated dependencies. If they don't exist yet GNU make will
# automatically generate them using the .depend: rule.
-include .depend
