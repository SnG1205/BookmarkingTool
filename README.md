# Bookmarking Tool
Switching to an OOP approach, redoing the project.

Starting with User Story 1: As a user I want to bookmark an URL

User Story 1a: The URL must be valid

User Story 2: As a user I want to be able to Tag a URL with a keyword

User Story 3: As a user when I add a duplicate bookmark, I want the system to increase the rating of that bookmark, because no exact duplicates should exist

User Story 4: As a user I want to know how many of my bookmarks are secure URLs

**User Story 5: !!!ToDo!!!**

User Story 6: As a user I want to be able to filter bookmarks by one keyword

**User Story 7: !!!ToDo!!!**

User Story 8: As a user I want to remove a TAG from a bookmark

User Story 9: As a user I want to remove a URL bookmark

User Story 10: As a user I want to add a current date/time when I add a bookmark

User Story 11: As a user I want to list my bookmarks sorted by rating (highest to smallest)

User Story 12: As a user I want to list my bookmarks sorted by date (newer to older)

User Story 13: ToDo

User Story 14: As a user, I want to backup my bookmark collection to a file.

## Bookmark URL

- Create File to store URLs in (only for the first URL)
- Check URL for validity
- Add  URL to created File


## Tag URL by word

- Add parameter "tag" to "addUrl" method, so that this tag appears after URL in .txt file
  
### Tests
1. Ensure that the tag is assigned to a URL.
2. Ensure that the right tag is assigned to a URL. In case another tag was assigned, test should fail.

## Duplicate Detection
-If given URL is duplicate of the one that already exists, it should not be added to the list.


## Secure URLs
- Read from file line by line, if URL contains "https", then it is secure.
- Add Secure file to a List.
- Return List.

## Filtering Bookmarks
- Take a keyword as a parameter.
- Read from file line by line, if URL contains the keyword.
- Add this URL to a List.
- Return List.

## Filtering Bookmarks by Rating
- Take list of bookmarks
- Sort each mark comparing the rating
- Bookmark with higher rating should appear first on the list
- Return List.

## Filtering Bookmarks by Date
- Take list of bookmarks
- Sort each mark comparing the date
- Bookmark with newer date should appear first on the list
- Return List.

## Saving Bookmarks
- Take list of bookmarks
- Create a file to store list in.
- Serialize list into the file.

## Restoring Bookmarks
- Call Deserialization on a file that contains stored bookmarks.
- Assign this object to created variable.