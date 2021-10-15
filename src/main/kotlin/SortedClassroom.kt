class SortedClassroom(vararg sts : Student) : Classroom<Student>(*sts) {
    abstract class StudentSoter {
        interface Comparator<T>

        abstract fun compare()
    }

    override fun iterator(): Iterator<Student> {
        return super.iterator()
    }
}