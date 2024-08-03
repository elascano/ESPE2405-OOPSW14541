const students = [];

function registerStudent() {
    const studentName = document.getElementById('studentName').value;
    const studentCourse = document.getElementById('studentCourse').value;
    const courseProfessor = document.getElementById('courseProfessor').value;

    if (studentName && studentCourse && courseProfessor) {
        const student = {
            name: studentName,
            course: studentCourse,
            professor: courseProfessor
        };

        students.push(student);
        displayStudents();
        clearForm();
    } else {
        alert('Please fill in all fields');
    }
}

function displayStudents() {
    const studentList = document.getElementById('studentList');
    studentList.innerHTML = '<h2>Registered Students</h2>';

    students.forEach(student => {
        const studentItem = document.createElement('div');
        studentItem.className = 'student-item';
        studentItem.innerHTML = `
            <strong>Name:</strong> ${student.name}<br>
            <strong>Course:</strong> ${student.course}<br>
            <strong>Professor:</strong> ${student.professor}
        `;
        studentList.appendChild(studentItem);
    });
}

function clearForm() {
    document.getElementById('studentName').value = '';
    document.getElementById('studentCourse').value = '';
    document.getElementById('courseProfessor').value = '';
}
