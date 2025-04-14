class Solution {
    public String defangIPaddr(String address) {
        if (address == null) {
            throw new IllegalArgumentException("invalid");
        }
        return address.replace(".", "[.]");
    }
}
