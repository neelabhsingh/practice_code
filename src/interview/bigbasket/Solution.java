package interview.bigbasket;
/*
You are tasked with implementing a configuration management system that handles JSON-based configurations at three hierarchical
 levels: Global, Organization, and Line of Business (LOB). Each level may have its own set of configurations,
 and configurations at lower levels should be able to override key-values from higher levels.

Write a Java program that provides functionality to merge configurations from these three levels, giving priority to configurations
at lower levels in case of conflicts.
Your program should be able to handle JSON input for configurations and produce a merged JSON configuration output.

Global- {“allow_cod”: false, “can_view_secret”: false,”max_vehicles”: 20}
Org - {“allow_cod”: false,”max_vehicles”: 20}
LOB - {“allow_cod”: false, “sms_charges”: 1.00,”max_vehicles”: 100}

Input- level=LOB

Output-
LOB: {“allow_cod”: false, “sms_charges”: 1.00,”max_vehicles”: 100,“can_view_secret”: false}
 */
class Hierarchical{
    private boolean allow_code;
    private boolean can_view_secret;
    private int max_vehicles;
    private int sms_charges;
}
public class Solution {
    public static void main(String[] args) {

    }
}
