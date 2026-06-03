# 🚀 Backend con Spring Boot - API de Microservicios

Este proyecto busca construir un **backend modular y escalable** utilizando **Spring Boot**.  
La idea es separar los dominios en diferentes microservicios, cada uno con su propia base de datos:

- 📦 **Productos** → Base de datos independiente
- 👤 **Usuarios/Clientes** → Base de datos independiente
- 🛒 **Compras** → Base de datos independiente
- 🔑 **Autenticación y Seguridad** → JWT (y a futuro OAuth2)

---

## ⚙️ Tecnologías iniciales

- **Spring Boot** (JDK 26)
- **Lombok** (para reducir boilerplate)
- **MySQL** (base de datos inicial)
- **Spring Security con JWT** (autenticación y autorización)

---

## 🌱 Futuras características

- 🔐 **OAuth2** para autenticación avanzada
- 🗄️ Soporte para **SQL Server** y **PostgreSQL**
- 🐳 **Docker** para contenerización y despliegue
- 🔧 **DevOps**: CI/CD con GitHub Actions o Jenkins
- 🧪 **QA/Testing**: pruebas unitarias e integración con JUnit y Mockito
- 📊 Monitoreo y métricas

---

## 🏗️ Arquitectura

El proyecto sigue una **arquitectura de microservicios**, donde cada módulo del negocio se implementa como un servicio independiente con su propia base de datos:

- **Productos Service** → gestiona catálogo de productos
- **Usuarios Service** → gestiona clientes y usuarios
- **Compras Service** → gestiona órdenes y transacciones
- **Auth Service** → gestiona autenticación y seguridad con JWT (y a futuro OAuth2)

Cada servicio es autónomo, se comunica mediante **APIs REST** y puede desplegarse de forma independiente.  
La arquitectura está pensada para crecer con integración de **Docker, DevOps (CI/CD), QA/Testing** y soporte para múltiples bases de datos (MySQL, SQL Server, PostgreSQL).
