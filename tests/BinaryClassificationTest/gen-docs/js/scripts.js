	// extract all headers

var headers = []

function walk (nodes) {
  nodes.forEach((node) => {
    var sub = Array.from(node.childNodes)
    if (sub.length) {
      walk(sub)
    }
    if (/h[1-6]/i.test(node.tagName)) {
      headers.push({
        id: node.getAttribute('id'),
        level: parseInt(node.tagName.replace('H', '')),
        title: node.innerText
      })
    }
  })
}

walk(Array.from(document.body.childNodes))

console.dir(headers)

// generate TOC

var link = (header) =>
  '<li><a href="#' + header.id + '">' + header.title + '</a></li>'

var html = '<ul class="toc">'

headers.forEach((header, index) => {
  if (index) {
    var prev = headers[index - 1]
  }
  if (!index || prev.level === header.level) {
    html += link(header)
  }
  else if (prev.level > header.level) {
    html += '</ul>' + link(header)
  }
  else if (prev.level < header.level) {
    html += '<ul>' + link(header)
  }
})

html += '</ul>'

document.body.insertAdjacentHTML('afterbegin', html)

function expandCamelCase(text){
	return text.replace(/([a-z])([A-Z])/g, '$1 $2');
}

document.querySelectorAll('.camel-exp').forEach((c)=>{
	c.innerText = expandCamelCase(c.innerText);
});
