# Contacts List  - Paired Project
## Contacts Manager CLI1 Application

  We will be building a command line application for keeping track of "contacts". A contact will be comprised of a a name and phone number combination.
## Specifications
The application should be able to:

- **(COMPLETE)** Show all your contacts
- **(COMPLETE)** Add a new contact
- **(COMPLETE)** Search a contact by her name
- **(COMPLETE)** Delete an existing contact
- **(COMPLETE)** The application should keep its data in a file named contacts.txt so that the information persists between runs of the application.

How you implement the above functionality is ultimately up to you, but here are a few thoughts to get you started.

- **(MET)** The text file should contain one contact per line.
- **(MET)** When the application starts, the contact list should be read from the file.
- **(MET)** Before the application exits, the contacts file should be rewritten.
- **(MET)** The user interface for your application should include a main menu like the following, where the user will need to enter a number between 1 and 5:

1. View contacts.
2. Add a new contact.
3. Search a contact by name.
4. Delete an existing contact.
5. Exit.
   - Enter an option (1, 2, 3, 4 or 5)

- **(MET)** Load all of the contacts by calling a method that returns a List of Contact objects.
- **(Function achieved without method call)** Call a method that shows the user the main menu and returns their choice of action.
- **(MET)** Using the user's choice from the previous step, call a method that performs that action (modifying the contents of the List of Contact objects if applicable).
- Keep calling the method from step two until the user chooses to exit.
- **(MET)** Once the user chooses to exit, re-write the contents of the contacts.txt file using the List of Contact objects.

##Bonus

- Format the phone numbers using dashes:
instead of 8675309, your output should display 867-5309
- Allow formatting phone numbers with different lengths. For example, phone numbers can have 10 or 7 digits. You can be even more creative here and allow international phone numbers.
- Warn the user when she tries to enter a contact with an existing name.
  - There's already a contact named Jane Doe. Do you want to overwrite it? (Yes/No)
  - If the answer is No allow the user to enter the information again.
- Format the output of the contacts, so that all of the columns have the same width.

