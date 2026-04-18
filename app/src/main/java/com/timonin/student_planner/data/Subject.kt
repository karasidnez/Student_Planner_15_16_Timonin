package com.timonin.student_planner.data

data class Subject(
    val id: String,
    val name: String,
    val professor: String,
    val credits: Int,
    val currentGrade: String,
    val description: String
)
val sampleSubject = listOf(
    Subject(
        id = "1",
        name = "Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        credits = 91,
        currentGrade = "Отлично",
        description = "Разработка нативных Android-приложений с использованием Kotlin и современных компонентов Jetpack Compose. Изучение архитектурных паттернов MVVM, работы с локальными базами данных и сетевыми API."
    ),
    Subject(
        id = "2",
        name = "Хих",
        professor = "Хах",
        credits = 134513456,
        currentGrade = "Молодец",
        description = "ЫЫыыыыыыыыыыыыыыыыыыыыыыыыыы"
    ),
    Subject(
        id = "3",
        name = "ЫЫе",
        professor = "Ыев.Ы.Ы",
        credits = 10,
        currentGrade = "Плохо",
        description = "ЫыЫыЫыЫыЫыЫ "
    ),
    Subject(
        id = "4",
        name = "Управление проектами",
        professor = "Трошина",
        credits = 91,
        currentGrade = "Отлично",
        description = "Делаем лабы на програме 13-го года"
    ),
    Subject(
        id = "5",
        name = "Математическое моделирование",
        professor = "Трошина",
        credits = 91,
        currentGrade = "Отлично",
        description = "Надо умные циферки считать"
    ),
    Subject(
        id = "6",
        name = "Инструментальные средства разработки программного обеспечения",
        professor = "Леонтьев Д.А.",
        credits = 91,
        currentGrade = "Отлично",
        description = "Ну в этом году мы пишем на html,css,js"
    ),
)