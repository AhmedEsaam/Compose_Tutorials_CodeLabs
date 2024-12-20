//package com.example.compose_tutorials.pathway1_compose_essentials
//
//import androidx.compose.animation.AnimatedContent
//import androidx.compose.animation.core.tween
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Surface
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.IntOffset
//
//@Composable
//fun SurveyQuestionScreen(
//    question: SurveyState.Questions,
//    shouldAskPermissions: Boolean,
//    onDoNotAskForPermission: () -> Unit,
//    onAction: (Int, SurveyActionType) -> Unit,
//    onDonePressed: () -> Unit,
//    onBackPressed: () -> Unit,
//) {
//    val questionState = remember(questions.currentQuestionIndex) {
//        questions.questionsState[questions.currentQuestionIndex]
//    }
//
//    Surface(modifier = Modifier.supportWideScreen()) {
//        Scaffold(
//            topBar = {
//                SurveyTopAppBar(
//                    questionIndex = questionState.questionIndex,
//                    totalQuestionsCount = questionState.totalQuestions,
//                    onBackPressed = onBackPressed
//                )
//            },
//            content = { innerPadding ->
//                AnimatedContent(
//                    targetState = questionState,
//                    transitionSpec = {
//                        val animationSpec: TweenSpec<IntOffset> = tween<>()
//                        val direction =
//                            if (targetState.questionIndex > initialState.questionIndex) {
//                                //
//                                AnimatedContentScope.SlideDirection
//                            } else {
//                                AnimatedContentScope.SlideDirection
//                            }
//                        slideIntoContainer(
//                            towards = direction
//                        )
//                    }
//                ) { }
//            },
//            bottomBar = {
//                SurveyBottomBar(
//                    questionState = questionState,
//                    onPreviousPressed = { question.currentQuestionIndex },
//                    onNextPressed = { question.currentQuestionIndex },
//                    onDonePressed = onDonePressed
//                )
//            }
//        )
//    }
//}