# 🎬 Movie Night - Jetpack Compose UI

<div align="center">
  
  ![Android](https://img.shields.io/badge/Platform-Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
  ![Kotlin](https://img.shields.io/badge/Language-Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
  ![Jetpack Compose](https://img.shields.io/badge/UI-Jetpack%20Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white)
  
</div>

## 📋 Overview

**Movie Night** is a beautifully designed Android application showcasing modern UI development with **Jetpack Compose**. The app features a horizontal pager displaying movie thumbnails with titles and showtimes, demonstrating the power and flexibility of Compose for building elegant user interfaces.

## ✨ Key Features

- **🎨 Modern UI**: Built entirely with Jetpack Compose
- **📱 Horizontal Pager**: Smooth swipeable movie carousel
- **🖼️ Movie Thumbnails**: High-quality movie posters and images
- **⏰ Showtime Display**: Clear presentation of movie schedules
- **🎭 Material Design 3**: Following latest design guidelines
- **🔄 Smooth Animations**: Fluid transitions and interactions
- **📐 Responsive Layout**: Adapts to different screen sizes
- **🧩 Modular Architecture**: Clean and reusable composable functions

## 🛠️ Tech Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Architecture**: MVVM (Model-View-ViewModel)
- **Design System**: Material Design 3
- **Pager**: Accompanist Pager / Compose Pager
- **Image Loading**: Coil Compose
- **State Management**: State and MutableState

## 📱 UI Components

### HorizontalPager
- Swipeable movie carousel
- Smooth page transitions
- Page indicators
- Snap-to-page behavior

### Movie Cards
- Movie poster/thumbnail
- Movie title
- Showtime information
- Genre badges
- Rating display

### Composable Functions
```kotlin
@Composable
fun MoviePager()

@Composable
fun MovieCard(movie: Movie)

@Composable
fun MovieInfo(title: String, showtime: String)
```

## 🎨 Design Features

- **Clean Layout**: Minimalist and focused design
- **Typography**: Clear and readable text hierarchy
- **Color Scheme**: Attractive color palette
- **Spacing**: Consistent padding and margins
- **Elevation**: Subtle shadows for depth
- **Animations**: Smooth enter/exit animations

## 🚀 Getting Started

### Prerequisites

- Android Studio Hedgehog or later
- Android SDK 24 or higher
- Kotlin 1.9+
- Jetpack Compose 1.5+

### Installation

1. Clone the repository:
```bash
git clone https://github.com/AhmedSh10/Movie-Night-Simple-UI-Using-Jetpack-Compose.git
```

2. Open the project in Android Studio

3. Sync Gradle dependencies

4. Build and run the project

## 📂 Project Structure

```
app/
├── ui/
│   ├── components/     # Reusable composables
│   ├── screens/        # Main screens
│   └── theme/          # Theme configuration
├── data/
│   └── models/         # Data models
├── viewmodel/          # ViewModels
└── utils/              # Utility functions
```

## 🎯 Use Cases

This project demonstrates:
- **Jetpack Compose Fundamentals**: Building UIs declaratively
- **Pager Implementation**: Creating swipeable content
- **State Management**: Handling UI state in Compose
- **Material Design**: Implementing design guidelines
- **Modular Composables**: Writing reusable components

## 🔧 Customization

The app is designed to be easily extensible:

### Adding New Movie Categories
```kotlin
enum class MovieCategory {
    ACTION, COMEDY, DRAMA, HORROR, SCI_FI
}
```

### Custom Themes
```kotlin
@Composable
fun MovieNightTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
)
```

### Dynamic Data
Replace static data with API calls:
```kotlin
viewModel.movies.collectAsState()
```

## 📚 Learning Resources

This project is perfect for learning:
- Jetpack Compose basics
- Pager implementation
- Material Design 3
- Kotlin coroutines with Compose
- State management patterns

## 🎓 Code Quality

- **Clean Code**: Well-organized and readable
- **Comments**: Documented composables
- **Best Practices**: Following Compose guidelines
- **Performance**: Optimized recomposition
- **Accessibility**: Content descriptions for screen readers

## 🔮 Future Enhancements

- [ ] Add movie details screen
- [ ] Implement search functionality
- [ ] Add favorites feature
- [ ] Integrate with movie API (TMDb)
- [ ] Add movie trailers
- [ ] Implement booking system
- [ ] Add user reviews and ratings
- [ ] Dark mode toggle

## 🤝 Contributing

Contributions are welcome! Feel free to:
- Report bugs
- Suggest new features
- Improve documentation
- Submit pull requests

## 📄 License

This project is available for educational and personal use.

## 👨‍💻 Developer

**Ahmed Shaaban**

- GitHub: [@AhmedSh10](https://github.com/AhmedSh10)
- LinkedIn: [Ahmed Shaaban](https://linkedin.com/in/ahmed-shaaban)

## 🙏 Acknowledgments

- Android team for Jetpack Compose
- Material Design team for design guidelines
- Compose community for inspiration

## 📖 Description

Movies Night is a simple Android app built with Jetpack Compose. It features a horizontal pager displaying movie thumbnails with titles and showtimes. The app uses a modular UI with composable functions, ensuring a clean layout. It's easy to extend and customize for different movie categories.

---

<div align="center">
  
  **⭐ If you find this project useful, please consider giving it a star!**
  
  **🎬 Enjoy your movie night!**
  
</div>
