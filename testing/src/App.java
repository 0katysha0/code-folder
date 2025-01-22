# Capstone Project Beta Testing
## Project Name: Tetris Game
## Group Members: Zlata and Kate

-------------------------------------

## Non-Programmer Feedback (Name: Theo)

### Problems/Issues that occurred while testing:
- Blocks sometimes do not move smoothly when pressing the arrow keys repeatedly.
- Difficulty understanding how to restart the game after a game over.
- The interface feels a bit plain and could use some visual enhancement.

### What are your general thoughts and feedback about the program?
The game is fun and addictive, but it lacks some polish. Adding sound effects and a restart button would improve the experience. The current visuals are functional but could be more engaging with different colors or animations.

### Coding Team - What we did in response to this feedback:
- Investigated and resolved the issue with block movement by adjusting the event handling for smoother transitions.
- Added a "Restart Game" button to make restarting the game easier.
- Enhanced the UI with more vibrant colors and basic animations for better visual appeal.

-------------------------------------

## External Programmer Feedback (Name: Artem)

### Problems/Issues that occurred while testing:
- Detected a bug where clearing multiple rows at once sometimes skips incrementing the score correctly.
- Observed that the game over condition does not always trigger when the grid is filled at the top.
- The game lacks an option to pause or save progress.

### What are your general thoughts and feedback about the program?
The code is clean and well-structured, but there are opportunities to optimize performance. Adding features like a pause function and saving progress would make the game more user-friendly and modern.

### Coding Team - What we did in response to this feedback:
- Fixed the scoring issue when clearing multiple rows by updating the `checkForFullRows` logic.
- Improved the game over detection logic to handle edge cases effectively.
- Added a pause functionality and planned for a save/load feature in future iterations.

-------------------------------------

## Coding Team - Known Bugs, Glitches, Issues

- Occasionally, blocks can overlap visually when moving horizontally during rapid key presses.
- The game lacks difficulty progression (e.g., increasing block drop speed over time).
- The current implementation does not support rotated blocks or different block shapes (only single blocks are used).
- No audio feedback for actions like clearing rows or game over.
- The window does not resize dynamically for different screen sizes, which might cause scaling issues on smaller displays.

### Next Steps:
- Address known bugs and improve stability.
- Add block rotation functionality and implement varying shapes.
- Integrate audio and dynamic scaling for a polished user experience.