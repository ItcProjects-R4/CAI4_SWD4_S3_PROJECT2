# CAI4_SWD4_S3_PROJECT2
# MoneyDash 💸

**MoneyDash** is a powerful, modern personal finance management application for Android. Built with a focus on organization, performance, and user experience, it helps users track their spending, manage income, and achieve their savings goals with ease.

## 🚀 Key Features

*   **Complete Authentication:** Secure Login, Sign-Up, Forgot Password, and Email Verification using Firebase Auth.
*   **Smart Dashboard:** Real-time summary of Total Balance (supporting negative values), Total Expenses, and Monthly Spending.
*   **Cloud Sync & Offline Support:** Uses a robust **Offline-First** approach with **Room Database** for local storage and **Firebase Firestore** for real-time cloud synchronization.
*   **Intelligent Savings Goals:** 
    *   Add and manage savings goals.
    *   **Auto-Redistribution Logic:** Automatically calculates and divides your savings pool across all active goals.
*   **Transaction Management:** 
    *   Support for **Recurring Transactions** (Daily, Weekly, Monthly).
    *   Advanced filtering by type, date, and category.
*   **Customization:**
    *   **Multi-language Support:** Seamless switching between **Arabic** and **English** within settings.
    *   **Dark Mode:** Independent theme settings for a comfortable viewing experience.
    *   **Profile Management:** Update your username across all services instantly.
*   **Visual Analysis:** Insightful summaries of income vs. expenses.

## 🏗️ Architecture & Design Patterns

The project is built following the **Clean Architecture** principles and **MVVM (Model-View-ViewModel)** pattern to ensure scalability, testability, and maintainability.

*   **Core:** Shared logic, navigation, UI components, and utilities.
*   **Features:** Modularized by functionality (Auth, Transactions, Home, Goals, Profile).
*   **Layers:** 
    *   **Domain:** Pure business logic (Entities, Repositories Interfaces, UseCases).
    *   **Data:** Implementation of repositories, Local DAOs (Room), and Remote Sources (Firestore).
    *   **UI:** Jetpack Compose screens and ViewModels.

## 🛠️ Tech Stack

*   **Language:** [Kotlin](https://kotlinlang.org/)
*   **UI Toolkit:** [Jetpack Compose](https://developer.android.com/jetpack/compose) (Declarative UI)
*   **Dependency Injection:** [Koin](https://insert-koin.io/)
*   **Local Database:** [Room](https://developer.android.com/training/data-storage/room)
*   **Remote Backend:** [Firebase](https://firebase.google.com/) (Auth, Firestore, Realtime Database)
*   **Navigation:** [Type-Safe Navigation Compose](https://developer.android.com/guide/navigation/design/type-safety)
*   **Concurrency:** [Kotlin Coroutines & Flow](https://kotlinlang.org/docs/coroutines-overview.html)
*   **Theme:** Material 3 Design

## ⚙️ Setup Instructions

1.  Clone the repository: `git clone https://github.com/GeorgeRaief/MoneyDash.git`
2.  Connect the app to your Firebase project.
3.  Download the `google-services.json` file and place it in the `app/` directory.
4.  Enable **Email/Password Auth**, **Firestore**, and **Realtime Database** in your Firebase console.
5.  Build and run the app on an emulator or physical device.

---
Developed with ❤️ by the MoneyDash Team.
