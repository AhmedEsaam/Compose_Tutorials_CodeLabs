package com.example.compose_tutorials.pathway1_compose_essentials

import android.media.Image
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_tutorials.R
import com.example.compose_tutorials.pathway1_compose_essentials.codelab1_first_compose_app.Greetings
import com.example.compose_tutorials.ui.theme.Compose_TutorialsTheme

data class Answer( val text: String)

@Composable
fun SurveyAnswer(
    answer: Answer,
    isSelected: Boolean,
    onAnswerSelected: (Answer) -> Unit
) {
    Surface(
        border = BorderStroke(
            1.dp,
            MaterialTheme.colorScheme.outline
        ),
        shape = MaterialTheme.shapes.small
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxSize()
                .padding(8.dp)
                .background(Color.White)
        ) {
            // Holds RadioButton State
            var selected: Boolean = false


            // UI Functions
//        Image(answer.image) // Error?
            Text(
                answer.text,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .size(100.dp, 30.dp)
                    .padding(5.dp)
                    .alpha(0.8f)
                    .clickable {
                        // Called when Text clicked
                    }
            )
            RadioButton(
                // property depends on state changes
                selected,
                // Event Handler (listens for click events and decides whether to update state)
                onClick = {
                    selected = !selected
                    onAnswerSelected(answer)
                }
            )
        }
    }

}



@Composable
fun SingleChoiceQuestion(answers: List<Answer>) {
    Column {
        if (answers.isEmpty()) {
            Text("There are no answers to choose from!")
        } else {

            var selectedAnswer: Answer? by
                rememberSaveable { mutableStateOf(null) }

            answers.forEach { answer ->
                SurveyAnswer(
                    answer = answer,
                    isSelected = (selectedAnswer == answer),
                    onAnswerSelected = { answer -> selectedAnswer = answer }
                )
            }

        }
    }
}


@Preview(showBackground = true, widthDp = 220, heightDp = 100)
@Composable
fun GreetingPreview() {
    Compose_TutorialsTheme {
        SurveyAnswer(Answer("Spark"), false, {})
    }
}