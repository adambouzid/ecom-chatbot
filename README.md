# ecom-chatbot

> Full documentation lives in [`README/README.md`](README/README.md). This top-level file exists so GitHub renders project info on the repo home page.

This Spring Boot project powers an e-commerce assistant reachable via Telegram and a lightweight web UI. The bot can answer questions about employees, salaries, and other business data.

## Preview

![Telegram conversation](README/assets/telegram-chat.jpeg)

## Quick Start

```bash
mvn clean package
mvn spring-boot:run
```

Configure secrets such as the Telegram bot token inside `src/main/resources/application.properties` before running.

For deeper setup details, architecture notes, and contribution guidelines, read [`README/README.md`](README/README.md).
