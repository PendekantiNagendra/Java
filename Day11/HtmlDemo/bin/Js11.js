/**
 * 
 */
i=0;
question = [
            "1.What is Object Oriented Programming?",
            "2.Who Introduced Java?",
            "3.How to Declare Generics?",
            "4.String.format() is used for...?"];

options  = 

function show() {
	document.getElementById("question").innerHTML = question[i];
}

function nextQuestion() {
	i = i + 1;
	if (i < 4) {
		show();
	} else {
		alert("Exam Over...");
	}
}