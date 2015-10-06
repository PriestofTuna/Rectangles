import javax.swing.JOptionPane;

public class Assignment3 {
	public enum AccountType {
		Admin, Student, Staff
	};

	public static void main(String[] args) {
		
		AccountType[] choices = { AccountType.Staff, AccountType.Staff, AccountType.Student };
		
		String TrueUser, TruePassword, password, TrueUserPass, user;
		TrueUser = ("name");
		TruePassword = ("password");
		user = JOptionPane.showInputDialog("Input your Username");
		TrueUserPass = (TrueUser + TruePassword);
		TrueUserPass.equals(AccountType.Admin);
		// int occurances = String.frequency(user, "name");
		if (user.equals(TrueUser)) {
			
			password = JOptionPane.showInputDialog("Input your password");
			if (password.equals(TruePassword)) {

				JOptionPane.showMessageDialog(null, "Hello, please choose your account type " + TrueUser);
				while (true) {

					// AccountType select = (AccountType)
					// JOptionPane.showInputDialog("a")
					// null, "Choose account type...","Account
					// Type",JOptionPane.INFORMATION_MESSAGE,
					// null,choices,choices[3]);

					AccountType select = (AccountType) JOptionPane.showInputDialog(null, "Enter the month.",
							// the line below this one is the out of bounds line
							"Account Type", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);
					select = (AccountType) JOptionPane.showInputDialog(null, "enter your account", "Account Type",
							JOptionPane.INFORMATION_MESSAGE, null, choices, choices[5]);

					while (true) {
						if (user + password != ("namepassword")) {

							switch (select) {
							case Admin:
								JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read file.");
								break;
							case Student:
								JOptionPane.showMessageDialog(null, "Welcome Student! You can only read file.");
								break;
							case Staff:
								JOptionPane.showMessageDialog(null,
										"Welcome Staff! You can update, read, add, delete file.");
								break;
							}

						}
					}
				}

			} else if (password != (TruePassword)) {
				password = JOptionPane.showInputDialog("Incorrect password, please Input your password");
			}
		} else if (user != (TrueUser)) {
			user = JOptionPane.showInputDialog("incorrect username, please Input your Username");

		}
	}
}
