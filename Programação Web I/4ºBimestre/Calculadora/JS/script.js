const display = document.querySelector("#display");
const botoes = document.querySelectorAll("button");
const erroMensagem = document.querySelector("#erro-mensagem");

botoes.forEach((item) => {
  item.onclick = () => {
    if (item.id === "clear") {
      display.innerText = "";
      erroMensagem.innerText = ""; 
    } else if (item.id === "backspace") {
      let string = display.innerText.toString();
      display.innerText = string.substr(0, string.length - 1);
      erroMensagem.innerText = "";
    } else if (display.innerText !== "" && item.id === "equal") {
      try {
        let result = eval(display.innerText);
        let resultStr = result.toString();
        if (resultStr.length > 18) {
          display.innerText = resultStr.slice(0, 18) + "E";
        } else {
          display.innerText = resultStr;
        }
      } catch {
        display.innerText = "Erro!";
        erroMensagem.innerText = ""; 
        setTimeout(() => (display.innerText = ""), 2000);
      }
    } else if (display.innerText === "" && item.id === "equal") {
      display.innerText = "Vazio!";
      erroMensagem.innerText = "";
      setTimeout(() => (display.innerText = ""), 2000);
    } else {

      if (display.innerText.length >= 18) {
        erroMensagem.innerText = "Erro! A calculadora suporta apenas 18 dígitos em seu display, incluindo os operadores.";
        setTimeout(() => (erroMensagem.innerText = ""), 4000);
      } else {
        display.innerText += item.id;
        erroMensagem.innerText = "";
      }
    }
  };
});
