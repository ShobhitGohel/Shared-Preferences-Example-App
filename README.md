# 💾 Shared Preferences Example App  

## 📘 Overview  
This is a simple Android application built using **Kotlin** that demonstrates how to **store and retrieve data locally** using **SharedPreferences**.  
Users can enter their **Name** and **Email**, save the data, and later load it to display on the screen.

---

## 🧠 Concept  
This project showcases:  
- Basic **Android UI development** using **LinearLayout**  
- Handling **Button click events** with Kotlin lambdas  
- Saving data locally with **SharedPreferences**  
- Retrieving and displaying stored data dynamically  
- Using **Toast notifications** to indicate successful operations  

---

## 🏗️ Project Structure  

app/
└── src/
└── main/
├── java/com/shobhu/assignment4/
│ └── MainActivity.kt
└── res/
└── layout/
└── activity_main.xml

yaml
Copy code

---

## 💻 Code Explanation  

### 🔹 MainActivity  
- Initializes `EditText`, `Button`, and `TextView` using `findViewById`.  
- Saves input data (Name & Email) to **SharedPreferences** on **Save Data** button click.  
- Loads saved data from **SharedPreferences** and displays it in the `TextView` on **Load Data** button click.  
- Displays **Toast notifications** to confirm data saving.  

### 🔹 activity_main.xml  
- Contains:  
  - Two `EditText` fields for Name and Email input  
  - Two `Button`s for saving and loading data  
  - A `TextView` to display loaded data  
- Layout is vertically aligned using **LinearLayout** and centered.  

---

## 🧩 How It Works  

1. App starts → input fields and buttons appear on screen.  
2. Enter Name and Email → tap **Save Data** → data is saved locally.  
3. Tap **Load Data** → saved Name and Email are displayed in the `TextView`.  
4. Repeating save and load operations update and display data as expected.  

---

## ⚙️ Requirements  

- **Android Studio**  
- **Kotlin** enabled project  
- **Minimum SDK:** 21 (Android 5.0 Lollipop)  

---

## 🚀 How to Run  

1. Clone or download this repository.  
2. Open the project in **Android Studio**.  
3. Sync Gradle and build the project.  
4. Run the app on an emulator or physical device.  
5. Enter Name and Email, tap **Save Data**, then tap **Load Data** to view stored information.  

---

## 📸 Preview  

| Input Screen | Data Display Screen |
|--------------|------------------|
| Enter Name & Email, tap Save | Saved Name & Email displayed in TextView |

---

## 🧑‍💻 Author  
**ShobhU**  
> A student exploring Android development, Kotlin fundamentals, and local data storage in Android apps
