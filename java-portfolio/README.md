# ☕ Java Portfolio Website

A professional developer portfolio built with **Spring Boot + Thymeleaf**, deployed automatically via **Git + GitHub Actions CI/CD**.

![Java](https://img.shields.io/badge/Java-17-orange?style=flat-square)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2-brightgreen?style=flat-square)
![Deploy](https://img.shields.io/badge/CI%2FCD-GitHub%20Actions-blue?style=flat-square)

---

## 🚀 Tech Stack

| Layer | Technology |
|-------|-----------|
| Backend | Java 17 + Spring Boot 3.2 |
| Templating | Thymeleaf |
| Styling | CSS3 (Custom) |
| Build | Maven |
| Version Control | Git + GitHub |
| CI/CD | GitHub Actions |
| Deployment | Render.com |

---

## 📁 Project Structure

```
java-portfolio/
├── src/
│   └── main/
│       ├── java/com/portfolio/
│       │   ├── PortfolioApplication.java   # Entry point
│       │   └── PortfolioController.java    # Route handler
│       └── resources/
│           ├── templates/
│           │   └── index.html              # Thymeleaf template
│           ├── static/
│           │   ├── css/style.css           # Styles
│           │   └── js/main.js              # Animations
│           └── application.properties
├── .github/
│   └── workflows/
│       └── deploy.yml                      # CI/CD pipeline
└── pom.xml
```

---

## ⚙️ Run Locally

### Prerequisites
- Java 17+
- Maven 3.8+
- Git

### Steps

```bash
# 1. Clone the repo
git clone https://github.com/YOUR_USERNAME/java-portfolio.git
cd java-portfolio

# 2. Build the project
mvn clean package

# 3. Run the app
mvn spring-boot:run

# 4. Open in browser
# http://localhost:8080
```

---

## 🌐 Deploy to Render (Free)

1. Push code to GitHub
2. Go to [render.com](https://render.com) → **New Web Service**
3. Connect your GitHub repo
4. Set build command: `mvn clean package -DskipTests`
5. Set start command: `java -jar target/java-portfolio-1.0.0.jar`
6. Add environment variable: `PORT=8080`
7. Click **Deploy** → Done! 🎉

---

## 🔄 Git Workflow

```bash
# Make changes, then:
git add .
git commit -m "feat: update portfolio content"
git push origin main

# GitHub Actions auto-builds & deploys on every push to main!
```

---

## 📜 License
MIT — free to use and customize.
trigger
