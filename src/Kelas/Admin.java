/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kelas;

/**
 *
 * @author SISKA FEBILIANI-2311103072-07-B
 */
public class Admin extends User {

    public Admin(String username, String password, String role) throws ValidasiInputException {
        super(username, password, "admin");
    }
}
