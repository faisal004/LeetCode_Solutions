/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = (s) =>{
    const trimmedText = s.replace(/\s+/g, ' ').trim();
    const wordslen=trimmedText.split(" ");
    
    const lastWord=wordslen.length-1;
    console.log(lastWord);
    console.log(wordslen[lastWord].length);
    return wordslen[lastWord].length;
    
   
};