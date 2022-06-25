function getFormElements() {
  for (i = 0; i < document.forms.length; i++) {
    for (j = 0; j < document.forms[i].elements.length; j++) {
      console.log(document.forms[i].elements[j].value);
    }
  }
}