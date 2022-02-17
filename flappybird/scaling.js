var upscaledCanvas = document.getElementById('game-graphics').getContext('2d');
  upscaledCanvas.mozImageSmoothingEnabled = false;
  upscaledCanvas.webkitImageSmoothingEnabled = false;
  upscaledCanvas.msImageSmoothingEnabled = false;
  upscaledCanvas.imageSmoothingEnabled = false;
  upscaledCanvas.drawImage(sourceImage, 0, 0, 8, 8, 0, 0, 120, 120);