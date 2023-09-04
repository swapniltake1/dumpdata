
# DUMP DATA => Excel to MySQL Data Upload

This is a simple Java Spring Boot application for uploading data from an Excel file to a MySQL database. It can be used as a template for similar data upload tasks.


## Features

- Uploads data from an Excel file to a MySQL database.
- Uses Spring Boot for the backend.
- Supports Excel files in XLSX format.
- Provides a basic template for handling Excel file uploads and database interactions.

## Getting Started

Follow these instructions to get a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Before you begin, ensure you have met the following requirements:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Apache Maven](https://maven.apache.org/download.cgi)
- [MySQL Database](https://www.mysql.com/downloads/)
- [Git](https://git-scm.com/downloads)

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/swapniltake1/dumpdata.git
   ```

2. Navigate to the project directory:

   ```bash
   cd dumpdata
   ```

3. Build the project using Maven:

   ```bash
   mvn clean install
   ```

4. Configure your MySQL database connection in `application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

5. Start the application:

   ```bash
   java -jar target/dumpdata-1.0.jar
   ```

## Usage

1. Ensure the application is running.
2. Access the web application at `http://localhost:8080`.
3. Upload an Excel file with data that matches the expected format.
4. Click the "Upload" button to initiate the data upload process.
5. Check the database to verify that the data has been successfully uploaded.

## Contributing

Contributions are welcome! If you would like to contribute to this project, please open an issue or create a pull request with your proposed changes.

## Screenshots

![image](https://github.com/swapniltake1/dumpdata/assets/61576958/d7be29ca-cf89-4f6b-8a3c-aeb6eff4d7d0)

![image](https://github.com/swapniltake1/dumpdata/assets/61576958/26e30306-b460-4ab1-9a01-4e1bba1ec8b0)



## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
