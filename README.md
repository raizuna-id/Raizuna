# 🧠 Raizuna AI

Project **Raizuna** dikembangkan oleh **Rezky Alamsyah Putra (Rezky AP)** menggunakan **Kotlin** untuk menghadirkan pengalaman interaksi terminal yang modern, aman, dan fleksibel.

![Kotlin Version](https://img.shields.io/badge/Kotlin-2.1.21-blue.svg)
![Gradle](https://img.shields.io/badge/Gradle-8.10.1-orange.svg)
![License](https://img.shields.io/badge/License-MIT-green.svg)
![Build](https://github.com/raizuna-id/Raizuna/actions/workflows/build.yml/badge.svg)
![Release](https://img.shields.io/github/v/release/raizuna-id/Raizuna?color=blueviolet)

---

## 🚀 Fitur Utama

### 🔹 Tampilan Awal
- ASCII Art banner dengan biodata developer  
- Animasi loading & splash screen  
- Informasi sistem & versi aplikasi  

### 🔹 Sistem Autentikasi
- Registrasi akun baru dengan validasi input  
- Login dengan username & password  
- Password disimpan menggunakan **PBKDF2 + salt**  
- Session management dengan token  
- Edit & update profil pengguna  

### 🔹 Menu Chat AI
- Dukungan **multiple AI providers** (OpenAI, Gemini, Claude, Local Models)  
- Context awareness (memori percakapan persisten)  
- Customizable personality (atur karakter AI)  
- Analisis file teks & dokumen  
- Ekspor riwayat chat ke berbagai format  

### 🔹 Network Configuration
- Modifikasi alamat IP (simulasi / konfigurasi)  
- Network diagnostics (ping, traceroute, dll)  
- Proxy & VPN settings  
- Port monitoring & management  

### 🔹 Feedback System
- Menu khusus untuk masukan pengguna  
- Penyimpanan feedback ke log/DB  
- Analisis feedback untuk pengembangan fitur  

---

## 🎨 Fitur UI

- Custom Border System (double, rounded, bold, ascii)  
- Color Themes: **Dark, Light, Matrix, Cyberpunk, Retro**  
- Responsive Terminal Layout menyesuaikan ukuran window  
- ASCII Art Gallery dengan animasi & efek khusus  
- Real-time System Dashboard dengan grafik ASCII  
- Hotkey System untuk navigasi cepat  

---

## 🔒 Lapisan Keamanan

- PBKDF2 Password Hashing dengan salt random  
- TOTP 2-Factor Authentication support  
- Session Encryption menggunakan **AES-256-GCM**  
- Rate Limiting & brute-force protection  
- Audit Logging untuk semua aktivitas sensitif  
- Input Sanitization & XSS prevention  

---

## 🤖 Supported AI Providers

- OpenAI GPT-4 / GPT-3.5 (function calling)  
- Anthropic Claude (v2, v3)  
- Google Gemini Pro (multimodal)  
- Local Models (Ollama / LLaMA.cpp)  
- Custom API Endpoints (self-hosted models)  
- Interactive Menus dengan navigasi arrow keys  

---

## 📂 Struktur Project

```text
src/
├── main/kotlin/
│   ├── core/
│   │   ├── Application.kt
│   │   ├── ConfigManager.kt
│   │   └── SessionManager.kt
│   ├── auth/
│   │   ├── Authentication.kt
│   │   ├── User.kt
│   │   └── Security.kt
│   ├── ai/
│   │   ├── ChatEngine.kt
│   │   ├── ModelProvider.kt
│   │   └── ContextManager.kt
│   ├── network/
│   │   ├── IPManager.kt
│   │   ├── NetworkUtils.kt
│   │   └── ProxyConfig.kt
│   └── ui/
│       ├── TerminalUI.kt
│       ├── MenuSystem.kt
│       └── ASCIIArt.kt
├── test/
└── resources/
```

---