_24_7 Healthcare App*

Comprehensive Healthcare Solutions at Your Fingertips

Objective

The main objective of this project is to develop a mobile application that provides 24/7 access to essential healthcare services.

Specific Goals

- Enable users to book lab tests and view results
- Facilitate online purchasing of medicines
- Allow users to find and book appointments with doctors
- Provide access to reliable health articles and information

Use in Society

- Accessibility: Easy access to healthcare services anytime, anywhere
- Convenience: Eliminates physical visits for routine healthcare services
- Time-Saving: Reduces time spent on booking appointments, buying medicines, and accessing health information
- Health Management: Helps users track their health history, appointments, and medical orders effectively

Why We Need It

- Current Challenges in Healthcare:
    - Limited access to healthcare services in remote areas
    - Long waiting times and inefficiencies in booking appointments and tests
    - Difficulty in managing personal health records and information
- Solution Provided by the App:
    - Centralized platform for various healthcare services
    - Enhances efficiency and effectiveness of healthcare delivery
    - Promotes better health management and preventive care

Layout of the App

1. Home Screen: Quick access to main features
2. Doctor Appointment Screen: Select from top doctors by specialty
3. Lab Test Screen: Book lab tests and view results
4. Medicine Order Screen: Browse and purchase medicines
5. Health Articles Screen: Access health-related articles
6. Order Details Screen: View past and current orders

Project Development Process

1. Design and Development

- Platform: Android Studio, the official IDE for Android development.
- Design: Utilized XML for designing the user interface, ensuring a clear and intuitive layout for users.
    - Created separate XML layout files for each activity (e.g., activity_lab_test.xml, activity_doctor_appointment.xml, etc.).

2. Database Integration

- Database Used: SQLite, a lightweight and efficient database for storing local data.
- Integration Process:
    - Created database schemas using SQL commands within the app.
    - Defined tables to store user data, lab test results, doctor schedules, and order details.
    - Implemented SQLiteOpenHelper class to manage database creation and version management.
    - Used SQL queries to perform CRUD operations on the database.

3. API Integration

- Purpose: Fetch and display real-time data for doctor scheduling and other dynamic content.

4. Data Collection

- Real-Time Data: Collected real-time data from Madurai, focusing on doctors' availability and scheduling.
- Usage in the App: Stored this data in the SQLite database and displayed it in the app's doctor appointment section.

5. Activities and User Interaction

- Activities: Created separate activities for different functionalities (e.g., LabTestActivity.java, DoctorAppointmentActivity.java, etc.).
- User Interaction: Implemented onClickListeners to handle user interactions and navigate between activities.

Conclusion

This project aims to provide an all-in-one healthcare solution, offering users the ability to book lab tests, purchase medicines, find doctors, and access health information effortlessly. Developed using Android Studio with a focus on user-friendly design and efficient data management through SQLite and APIs, the 24*7 Healthcare App enhances healthcare accessibility and convenience.   

Future Enhancements

1. Telemedicine Integration: Video consultations with doctors
2. AI Health Assistant: Personalized health advice
3. Wearable Device Integration: Real-time health monitoring
4. Personalized Health Plans: Customized plans based on user data and health goals
5. Multi-language Support: Cater to a broader audience
