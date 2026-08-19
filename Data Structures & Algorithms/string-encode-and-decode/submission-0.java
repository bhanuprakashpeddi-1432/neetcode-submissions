class Solution {
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    // Decodes a single string back to a list of strings.
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            // Find the delimiter separating the length and the string
            int delimiterIdx = str.indexOf('#', i);
            
            // Extract the length of the next string
            int length = Integer.parseInt(str.substring(i, delimiterIdx));
            
            // Move pointer past the delimiter
            i = delimiterIdx + 1;
            
            // Extract the actual string using the parsed length
            String originalStr = str.substring(i, i + length);
            result.add(originalStr);
            
            // Move pointer to the start of the next encoded block
            i += length;
        }
        
        return result;
    }
}