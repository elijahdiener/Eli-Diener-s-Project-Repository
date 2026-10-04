import java.lang.StringIndexOutOfBoundsException;

public class EmailAddress
{
    private String localPart;
    private String domain;

    public EmailAddress(String localPart, String domain)
    {
        this.localPart = localPart;
        this.domain = domain;
    }

    public EmailAddress()
    {
        this("johndoe", "website.cxx");
    }

    @Override
    public String toString()
    {
        return localPart + "@" + domain;
    }

    public String toAntiSpamString()
    {
        int length = 0;
        String domainName = "";
        String topLevelDomain = "";
        boolean errorDetection = false;
        while (domain.charAt(length) != '.')
        {
            domainName += domain.charAt(length);
            length++;
        }
        length++;
        while (!errorDetection) {
            try {
                topLevelDomain += domain.charAt(length);
            } catch (StringIndexOutOfBoundsException e) {
                errorDetection = true;
            }
            length++;
        } // I wrote this while acknowledging the existence of String.length() and simultaneously
        //neglecting to realize I could use it to detect the end of the string. I just wanted to
        //clear that up because I made this way more complicated than was necessary
        return localPart + " at " + domainName + " dot " + topLevelDomain;
    }

    public String getLocalPart()
    {
        return localPart;
    }

    public String getDomain()
    {
        return domain;
    }

    public void setLocalPart(String localPart)
    {this.localPart = localPart;}

    public void setDomain(String domain)
    {this.domain = domain;}
}
