# 🚍 MyBus – Smart Bus Management & Booking System

**MyBus** is an Android-based application built to revolutionize how college and private institution bus systems operate. It bridges the gap between passengers (students, faculty) and bus services (drivers, administrators) with features like live tracking, secure login, seat booking, and payment integration.

> 🔐 The project is currently under live testing and Razorpay integration approval. This repository is shared for verification purposes.

---

## 🌟 Core Features Overview

### 🎫 Seat Booking System
- Allows users to view seat availability in real time.
- Seats are color-coded based on availability: Booked, Available, and Reserved.
- Once a seat is selected, it’s temporarily locked until payment is completed (Razorpay integration).
- Every booking is assigned a unique `Ticket ID` linked to a bus and date.

### 📍 Stop Request System
- Users can request a bus to stop at their current location if they are within **500 meters of a national highway**.
- If outside range, the app shows a warning via a built-in `AppPopup` dialog.

### 🧑‍✈️ Driver & Passenger Roles
- Separate login flows for **Drivers** and **Travelers**.
- Driver view shows the route and current booking list.
- Traveler view enables booking, profile access, and stop requests.

---

## 💳 Razorpay Payment Integration (Pending Approval)

We plan to use **Razorpay Payment Links API** to dynamically generate payment links for each booking. Here's how we plan to use it:

### 🔁 Dynamic Pricing Logic
- Seat pricing is calculated based on the number of selected seats:
  - ₹10 for 1 seat  
  - ₹20 for 2 seats  
  - ₹30 for 3 seats, and so on.

### 📤 Flow for Payments
1. **User selects seats**
2. The app calculates the total amount.
3. A **Razorpay Payment Link** is generated using the Razorpay REST API.
4. The link is sent to the **user’s email** or shown directly in the app.
5. On successful payment, booking is confirmed and stored in Firestore.

### ✅ Benefits of Razorpay
- Secure UPI, Card, and Wallet payments.
- Instant transaction confirmation webhooks (will be integrated).
- Receipt generation for each transaction.

---

## 🔒 Security Measures

- **Email & Password Authentication** with Firebase Auth.
- **Firestore Rules** to protect user data based on roles.
- Only authenticated users can request stops or track the bus.
- Booking validation ensures seat status is synced before and after payment.

---

## 🧪 Tech Stack

- **Kotlin (Jetpack Compose)** – modern declarative UI.
- **Firebase Firestore** – real-time backend and cloud storage.
- **Razorpay** – Payment gateway (Live API under review).
- **Google Maps SDK** – Real-time GPS tracking.
- **SQLite (optional)** – Local caching of static media.

---

## 📲 App Status

- ✅ Seat Booking & Stop Requests implemented.
- ✅ Driver & Traveler flows tested.
- 🚧 Razorpay integration pending live API access.
- 📦 APK available in the final release (currently hosted privately for reviewers).

---

## 📁 GitHub Purpose

This repository is created to:
- Provide codebase access for Razorpay live key verification.
- Demonstrate that the app is real and under production.
- Allow Razorpay to verify end-to-end usage of payment links securely.

---

## 📷 Screenshots & APK (For Razorpay Review Only)

| Feature | Screenshot |
|--------|------------|
| Home Page | _Coming Soon_ |
| Booking Page | _Coming Soon_ |
| Payment Popup | _Coming Soon_ |
| Bus Tracker | _Coming Soon_ |

---

## 📬 Contact Developer

**Name:** Akshay Sheelam  
**Email:** [sheelamakshay@gmail.com](mailto:sheelamakshay@gmail.com)  
**GitHub:** [github.com/sheelamakshay](https://github.com/sheelamakshay)

---

> 💡 *Note: This application is under development with active iterations. Razorpay integration will go live as soon as API keys are approved.*
