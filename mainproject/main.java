package mainproject;

	import mainproject.MenuOptions;
	import mainproject.Operators;
	import mainproject.options;

	public class main {


			public static void main(String[] args) {
					
					// Create "main" folder if not present in current folder structure
					Operators.createMainFolderIfNotPresent("main");
					
					MenuOptions.printWelcomeScreen("LockedMe", "DHANUSH");
					
					options.handleWelcomeScreenInput();
				}

			}

