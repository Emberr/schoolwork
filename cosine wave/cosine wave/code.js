let canvas = document.getElementById("kyo-is-a-moron")
let context = canvas.getContext("2d")

let timer = 0
function drawFrame() {
context.clearRect(0,0,600,600)
context.lineWidth = 1
context.beginPath()

for (let y=0;y<600;y+=10) {
    let y2 = Math.cos((timer+y)/300)*200+200
    context.moveTo(0,y2)
    context.lineTo(600,y2)
    
}
context.stroke()
timer += 1
}

setInterval(drawFrame, 0)