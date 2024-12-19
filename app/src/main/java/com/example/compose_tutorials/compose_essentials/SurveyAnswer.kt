package com.example.compose_tutorials.compose_essentials//package com.example.compose_tutorials
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.material3.RadioButton
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.MutableState
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.saveable.rememberSaveable
//import androidx.compose.runtime.setValue
//
//
//data class Answer(val image: String, val text: String)
//
//@Composable
//fun SurveyAnswer(
//    answer: Answer,
//    isSelected: Boolean,
//    onAnswerSelected: (Answer) -> Unit
//) {
//    Row {
//        // Holds RadioButton State
//        var selected: Boolean = false
//
//        // UI Functions
//        Image(answer.image)
//        Text(answer.text)
//        RadioButton(
//            // property depends on state changes
//            selected,
//            // Event Handler (listens for click events and decides whether to update state)
//            onClick = {
//                selected = !selected
//                onAnswerSelected(answer)
//            }
//        )
//    }
//}
//
//
//@Composable
//fun SingleChoiceQuestion(answers: List<Answer>) {
//    Column {
//        if (answers.isEmpty()) {
//            Text("There are no answers to choose from!")
//        } else {
//
//            var selectedAnswer: Answer? by
//                rememberSaveable { mutableStateOf(null) }
//
//            answers.forEach { answer ->
//                SurveyAnswer(
//                    answer = answer,
//                    isSelected = (selectedAnswer == answer),
//                    onAnswerSelected = { answer -> selectedAnswer = answer }
//                )
//            }
//
//        }
//    }
//}
