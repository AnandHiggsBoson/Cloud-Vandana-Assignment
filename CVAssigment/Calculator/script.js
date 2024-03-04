let input = "";

function appendInput(value) {
  input += value;
  document.getElementById("result").value = input;
}

function clearInput() {
  input = "";
  document.getElementById("result").value = input;
}

function calculate() {
  try {
    input = eval(input);
    document.getElementById("result").value = input;
  } catch (error) {
    document.getElementById("result").value = "Error";
  }
}
