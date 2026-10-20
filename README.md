# ResourcesLab — Student Portal

Android-приложение на Kotlin, созданное в Android Studio в рамках практической работы / СРС.

## Тема

**Портал группы: студенты и оценки**

Приложение состоит из трех экранов:

1. **MainActivity** — главный экран с краткой информацией о группе.
2. **ListActivity** — список из 8 студентов и их оценок.
3. **DetailActivity** — карточка выбранного студента с его оценкой.

## Функциональность

- переход между экранами через явные `Intent`;
- передача имени студента и оценки через `putExtra()`;
- возврат из карточки студента через `finish()`;
- использование `LinearLayout`, `ScrollView` и `RelativeLayout`;
- хранение строк, цветов и размеров в `res/values`;
- логирование методов жизненного цикла Activity через `Log`;
- логирование основных действий пользователя.

## Студенты

- Ramazan — 90
- Ali — 80
- Olzhas — 85
- Timur — 88
- Ayan — 76
- Daniyar — 92
- Aslan — 84
- Arman — 79

## Технологии

- Kotlin
- Android Studio
- XML Views
- Gradle
- minSdk 26
- targetSdk 37
- compileSdk 37

## Структура проекта

```text
app/
├── manifests/
│   └── AndroidManifest.xml
├── kotlin+java/com.example.resourceslab/
│   ├── MainActivity.kt
│   ├── ListActivity.kt
│   ├── DetailActivity.kt
│   ├── Lab1.kt
│   └── Lab2.kt
└── res/
    ├── layout/
    │   ├── activity_main.xml
    │   ├── activity_list.xml
    │   └── activity_detail.xml
    └── values/
        ├── strings.xml
        ├── colors.xml
        └── dimens.xml
