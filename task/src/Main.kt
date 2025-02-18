fun main() {
    val admin = UserRole.ADMIN
    val editor = UserRole.EDITOR
    val viewer = UserRole.VIEWER


    println("Does dmin has access to level 1 task? ${hasAccess(admin, 1)}")
    println("Does editor has access to level 2 task? ${hasAccess(editor, 2)}")
    println("Does viewer has access to level 3 task? ${hasAccess(viewer, 3)}")


    println()
    printDetails()
}

enum class UserRole(val accessLevel: Int) {
    ADMIN(3), EDITOR(2), VIEWER(1);
}

fun hasAccess(role: UserRole, requiredAccessLevel: Int): Boolean {
    return role.accessLevel >= requiredAccessLevel
}
fun printDetails() {
    for (role in UserRole.values()) {
        println("${role.name}: Access Level ${role.accessLevel}")
    }
}

