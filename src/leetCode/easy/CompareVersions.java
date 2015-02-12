package leetCode.easy;

public class CompareVersions
{

    public static void main(String args[])
    {
        String[] v1 = "1.0.0.42".split("\\.");
        for (int i = 0; i < v1.length; i++)
        {
            System.out.println(v1[i]);
        }

    }

    public int compareVersion(String version1, String version2)
    {
        if (version1 == null || version2 == null)
        {
            return 0;
        }

        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int minlen = Math.min(v1.length, v2.length);
        for (int i = 0; i < minlen; i++)
        {
            int level1 = Integer.parseInt(v1[i]);
            int level2 = Integer.parseInt(v2[i]);

            if (level1 == level2)
            {
                continue;
            }
            else if (level1 < level2)
            {
                return -1;
            }
            else
            {
                return 1;
            }
        }

        if (v1.length > v2.length)
        {
            if (isZero(v1, minlen))
                return 0;
            return 1;
        }
        else if (v1.length < v2.length)
        {
            if (isZero(v2, minlen))
                return 0;
            return -1;
        }
        else
        {
            return 0;
        }
    }

    public boolean isZero(String[] v, int minlen)
    {
        for (int i = minlen; i < v.length; i++)
        {
            if (Integer.parseInt(v[i]) != 0)
            {
                return false;
            }
        }
        return true;
    }
}
