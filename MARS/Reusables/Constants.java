package Reusables;

import java.util.HashMap;

import org.openqa.selenium.WebElement;

public class Constants{
	public static final String TestDataFileLocation = "C:\\Users\\rightster\\Documents\\MARSTestInput1405.xls";
	public static final String FuncTest_URL = "https://176.34.240.152";
	public static final String LogInScreen_URL = "/user/login";
	private static final String SIGN_OUT_XPATH = "html/body/div[1]/div/header/div/div/div[3]/a";
	public static final String PAGE_TITLE_EPG_SCREEN = "Programme Guide - Live Sports - Rightster";
	
	//country Xpaths to be used when setting restrictions
	public static final String AFRICA_DROP_DOWN_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[2]/h3[1]/a";
	public static final String ASIA_DROP_DOWN_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[2]/h3[3]/a";	
	public static final String EUROPE_DROP_DOWN_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[2]/h3[7]";
	public static final String NORTHAMERICA_DROP_DOWN_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[2]/h3[11]/a";
	public static final String OCEANIA_DROP_DOWN_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[2]/h3[12]/a";
	public static final String SOUTHAMERICA_DROP_DOWN_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[2]/h3[14]/a";
	
	Base base = new Base();
	
	public WebElement SignOutLocator()
	{
		
		WebElement element = base.FindElementByXpath(getSignOutXpath());
		return element;
	}
	
	
	public static HashMap<String, String> continent = new HashMap<String, String>();
	public static void PutContinentXpath()
	{
		
		continent.put("Algeria", AFRICA_DROP_DOWN_XPATH);
		continent.put("Angola", AFRICA_DROP_DOWN_XPATH);
		continent.put("Benin", AFRICA_DROP_DOWN_XPATH);
		continent.put("Botswana", AFRICA_DROP_DOWN_XPATH);
		continent.put("Burkina Faso", AFRICA_DROP_DOWN_XPATH);
		continent.put("Burundi", AFRICA_DROP_DOWN_XPATH);
		continent.put("Cameroon", AFRICA_DROP_DOWN_XPATH);
		continent.put("Cape Verde", AFRICA_DROP_DOWN_XPATH);
		continent.put("Central African Republic", AFRICA_DROP_DOWN_XPATH);
		continent.put("Chad", AFRICA_DROP_DOWN_XPATH);
		continent.put("Comoros", AFRICA_DROP_DOWN_XPATH);
		continent.put("Congo", AFRICA_DROP_DOWN_XPATH);
		continent.put("DR Congo", AFRICA_DROP_DOWN_XPATH);
		continent.put("Côte d'Ivoire", AFRICA_DROP_DOWN_XPATH);
		continent.put("Djibouti", AFRICA_DROP_DOWN_XPATH);
		continent.put("Egypt", AFRICA_DROP_DOWN_XPATH);
		continent.put("Equatorial Guinea", AFRICA_DROP_DOWN_XPATH);
		continent.put("Eritrea", AFRICA_DROP_DOWN_XPATH);
		continent.put("Ethiopia", AFRICA_DROP_DOWN_XPATH);
		continent.put("Gabon", AFRICA_DROP_DOWN_XPATH);
		continent.put("Gambia", AFRICA_DROP_DOWN_XPATH);
		continent.put("Ghana", AFRICA_DROP_DOWN_XPATH);
		continent.put("Guinea", AFRICA_DROP_DOWN_XPATH);
		continent.put("Guinea-Bissau", AFRICA_DROP_DOWN_XPATH);
		continent.put("Kenya", AFRICA_DROP_DOWN_XPATH);
		continent.put("Lesotho", AFRICA_DROP_DOWN_XPATH);
		continent.put("Liberia", AFRICA_DROP_DOWN_XPATH);
		continent.put("Libya", AFRICA_DROP_DOWN_XPATH);
		continent.put("Madagascar", AFRICA_DROP_DOWN_XPATH);
		continent.put("Malawi", AFRICA_DROP_DOWN_XPATH);
		continent.put("Mauritania", AFRICA_DROP_DOWN_XPATH);
		continent.put("Mauritius", AFRICA_DROP_DOWN_XPATH);
		continent.put("Mayotte", AFRICA_DROP_DOWN_XPATH);
		continent.put("Morocco", AFRICA_DROP_DOWN_XPATH);
		continent.put("Mozambique", AFRICA_DROP_DOWN_XPATH);
		continent.put("Namibia", AFRICA_DROP_DOWN_XPATH);
		continent.put("Niger", AFRICA_DROP_DOWN_XPATH);
		continent.put("Nigeria", AFRICA_DROP_DOWN_XPATH);
		continent.put("Réunion", AFRICA_DROP_DOWN_XPATH);
		continent.put("Rwanda", AFRICA_DROP_DOWN_XPATH);
		continent.put("St Helena, Ascension & Tristan da Cunha", AFRICA_DROP_DOWN_XPATH);
		continent.put("Sao Tome & Principe", AFRICA_DROP_DOWN_XPATH);
		continent.put("Senegal", AFRICA_DROP_DOWN_XPATH);
		continent.put("Seychelles", AFRICA_DROP_DOWN_XPATH);
		continent.put("Sierra Leone", AFRICA_DROP_DOWN_XPATH);
		continent.put("Somalia", AFRICA_DROP_DOWN_XPATH);
		continent.put("South Africa", AFRICA_DROP_DOWN_XPATH);
		continent.put("South Sudan", AFRICA_DROP_DOWN_XPATH);
		continent.put("Sudan", AFRICA_DROP_DOWN_XPATH);
		continent.put("Swaziland", AFRICA_DROP_DOWN_XPATH);
		continent.put("Tanzania, United Republic of", AFRICA_DROP_DOWN_XPATH);
		continent.put("Togo", AFRICA_DROP_DOWN_XPATH);
		continent.put("Tunisia", AFRICA_DROP_DOWN_XPATH);
		continent.put("Uganda", AFRICA_DROP_DOWN_XPATH);
		continent.put("Western Sahara", AFRICA_DROP_DOWN_XPATH);
		continent.put("Zambia", AFRICA_DROP_DOWN_XPATH);
		continent.put("Zimbabwe", AFRICA_DROP_DOWN_XPATH);
		
		continent.put("Afghanistan", ASIA_DROP_DOWN_XPATH);
		continent.put("Armenia", ASIA_DROP_DOWN_XPATH);
		continent.put("Azerbaijan", ASIA_DROP_DOWN_XPATH);
		continent.put("Bahrain", ASIA_DROP_DOWN_XPATH);
		continent.put("Bangladesh", ASIA_DROP_DOWN_XPATH);
		continent.put("Bhutan", ASIA_DROP_DOWN_XPATH);
		continent.put("British Indian Ocean Territory", ASIA_DROP_DOWN_XPATH);
		continent.put("Brunei Darussalam", ASIA_DROP_DOWN_XPATH);
		continent.put("Cambodia", ASIA_DROP_DOWN_XPATH);
		continent.put("China", ASIA_DROP_DOWN_XPATH);
		continent.put("Christmas Island", ASIA_DROP_DOWN_XPATH);
		continent.put("Cocos (Keeling) Islands", ASIA_DROP_DOWN_XPATH);
		continent.put("Cyprus", ASIA_DROP_DOWN_XPATH);
		continent.put("Georgia", ASIA_DROP_DOWN_XPATH);
		continent.put("Hong Kong", ASIA_DROP_DOWN_XPATH);
		continent.put("India", ASIA_DROP_DOWN_XPATH);
		continent.put("Indonesia", ASIA_DROP_DOWN_XPATH);
		continent.put("Iran, Islamic Republic of", ASIA_DROP_DOWN_XPATH);
		continent.put("Iraq", ASIA_DROP_DOWN_XPATH);
		continent.put("Israel", ASIA_DROP_DOWN_XPATH);
		continent.put("Japan", ASIA_DROP_DOWN_XPATH);
		continent.put("Jordan", ASIA_DROP_DOWN_XPATH);
		continent.put("Kazakhstan", ASIA_DROP_DOWN_XPATH);
		continent.put("Korea PDR", ASIA_DROP_DOWN_XPATH);
		continent.put("Korea, Republic of", ASIA_DROP_DOWN_XPATH);
		continent.put("Kuwait", ASIA_DROP_DOWN_XPATH);
		continent.put("Kyrgyzstan", ASIA_DROP_DOWN_XPATH);
		continent.put("Lao PDR", ASIA_DROP_DOWN_XPATH);
		continent.put("Lebanon", ASIA_DROP_DOWN_XPATH);
		continent.put("Macao", ASIA_DROP_DOWN_XPATH);
		continent.put("Malaysia", ASIA_DROP_DOWN_XPATH);
		continent.put("Maldives", ASIA_DROP_DOWN_XPATH);
		continent.put("Mongolia", ASIA_DROP_DOWN_XPATH);
		continent.put("Myanmar", ASIA_DROP_DOWN_XPATH);
		continent.put("Nepal", ASIA_DROP_DOWN_XPATH);
		continent.put("Oman", ASIA_DROP_DOWN_XPATH);
		continent.put("Pakistan", ASIA_DROP_DOWN_XPATH);
		continent.put("Palestinian Territory", ASIA_DROP_DOWN_XPATH);
		continent.put("Philippines", ASIA_DROP_DOWN_XPATH);
		continent.put("Qatar", ASIA_DROP_DOWN_XPATH);
		continent.put("Russian Federation", ASIA_DROP_DOWN_XPATH);
		continent.put("Saudi Arabia", ASIA_DROP_DOWN_XPATH);
		continent.put("Singapore", ASIA_DROP_DOWN_XPATH);
		continent.put("Sri Lanka", ASIA_DROP_DOWN_XPATH);
		continent.put("Syrian Arab Republic", ASIA_DROP_DOWN_XPATH);
		continent.put("Taiwan, Province of China", ASIA_DROP_DOWN_XPATH);
		continent.put("Tajikistan", ASIA_DROP_DOWN_XPATH);
		continent.put("Thailand", ASIA_DROP_DOWN_XPATH);
		continent.put("Timor-Leste", ASIA_DROP_DOWN_XPATH);
		continent.put("Turkey", ASIA_DROP_DOWN_XPATH);
		continent.put("Turkmenistan", ASIA_DROP_DOWN_XPATH);
		continent.put("United Arab Emirates", ASIA_DROP_DOWN_XPATH);
		continent.put("Uzbekistan", ASIA_DROP_DOWN_XPATH);
		continent.put("VietNam", ASIA_DROP_DOWN_XPATH);
		continent.put("Yemen", ASIA_DROP_DOWN_XPATH);
		
		continent.put("Åland Islands", EUROPE_DROP_DOWN_XPATH);
		continent.put("Albania", EUROPE_DROP_DOWN_XPATH);
		continent.put("Andorra", EUROPE_DROP_DOWN_XPATH);
		continent.put("Armenia", EUROPE_DROP_DOWN_XPATH);
		continent.put("Austria", EUROPE_DROP_DOWN_XPATH);
		continent.put("Azerbaijan", EUROPE_DROP_DOWN_XPATH);
		continent.put("Belarus", EUROPE_DROP_DOWN_XPATH);
		continent.put("Belgium", EUROPE_DROP_DOWN_XPATH);
		continent.put("Bosnia & Herzegovina", EUROPE_DROP_DOWN_XPATH);
		continent.put("Bulgaria", EUROPE_DROP_DOWN_XPATH);
		continent.put("Croatia", EUROPE_DROP_DOWN_XPATH);
		continent.put("Cyprus", EUROPE_DROP_DOWN_XPATH);
		continent.put("Czech Republic", EUROPE_DROP_DOWN_XPATH);
		continent.put("Denmark", EUROPE_DROP_DOWN_XPATH);
		continent.put("Estonia", EUROPE_DROP_DOWN_XPATH);
		continent.put("Faroe Islands", EUROPE_DROP_DOWN_XPATH);
		continent.put("Finland", EUROPE_DROP_DOWN_XPATH);
		continent.put("France", EUROPE_DROP_DOWN_XPATH);
		continent.put("Georgia", EUROPE_DROP_DOWN_XPATH);
		continent.put("Germany", EUROPE_DROP_DOWN_XPATH);
		continent.put("Gibraltar", EUROPE_DROP_DOWN_XPATH);
		continent.put("Greece", EUROPE_DROP_DOWN_XPATH);
		continent.put("Guernsey", EUROPE_DROP_DOWN_XPATH);
		continent.put("Holy See (Vatican City State)", EUROPE_DROP_DOWN_XPATH);
		continent.put("Hungary", EUROPE_DROP_DOWN_XPATH);
		continent.put("Iceland", EUROPE_DROP_DOWN_XPATH);
		continent.put("Ireland", EUROPE_DROP_DOWN_XPATH);
		continent.put("Isle of Man", EUROPE_DROP_DOWN_XPATH);
		continent.put("Italy", EUROPE_DROP_DOWN_XPATH);
		continent.put("Jersey", EUROPE_DROP_DOWN_XPATH);
		continent.put("Kazakhstan", EUROPE_DROP_DOWN_XPATH);
		continent.put("Latvia", EUROPE_DROP_DOWN_XPATH);
		continent.put("Liechtenstein", EUROPE_DROP_DOWN_XPATH);
		continent.put("Lithuania", EUROPE_DROP_DOWN_XPATH);
		continent.put("Luxembourg", EUROPE_DROP_DOWN_XPATH);
		continent.put("Macedonia (FYR)", EUROPE_DROP_DOWN_XPATH);
		continent.put("Malta", EUROPE_DROP_DOWN_XPATH);
		continent.put("Moldova, Republic of", EUROPE_DROP_DOWN_XPATH);
		continent.put("Monaco", EUROPE_DROP_DOWN_XPATH);
		continent.put("Montenegro", EUROPE_DROP_DOWN_XPATH);
		continent.put("Netherlands", EUROPE_DROP_DOWN_XPATH);
		continent.put("Norway", EUROPE_DROP_DOWN_XPATH);
		continent.put("Poland", EUROPE_DROP_DOWN_XPATH);
		continent.put("Portugal", EUROPE_DROP_DOWN_XPATH);
		continent.put("Romania", EUROPE_DROP_DOWN_XPATH);
		continent.put("Russian Federation", EUROPE_DROP_DOWN_XPATH);
		continent.put("San Marino", EUROPE_DROP_DOWN_XPATH);
		continent.put("Serbia", EUROPE_DROP_DOWN_XPATH);
		continent.put("Slovakia", EUROPE_DROP_DOWN_XPATH);
		continent.put("Slovenia", EUROPE_DROP_DOWN_XPATH);
		continent.put("Spain", EUROPE_DROP_DOWN_XPATH);
		continent.put("Svalbard & Jan Mayen", EUROPE_DROP_DOWN_XPATH);
		continent.put("Sweden", EUROPE_DROP_DOWN_XPATH);
		continent.put("Switzerland", EUROPE_DROP_DOWN_XPATH);
		continent.put("Turkey", EUROPE_DROP_DOWN_XPATH);
		continent.put("Ukraine", EUROPE_DROP_DOWN_XPATH);
		continent.put("United Kingdom", EUROPE_DROP_DOWN_XPATH);
		
		continent.put("Anguilla", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Antigua & Barbuda", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Aruba", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Bahamas", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Barbados", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Belize", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Bermuda", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Bonaire, Sint Eustatius & Saba", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Canada", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Cayman Islands", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Costa Rica", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Cuba", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Curaçao", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Dominica", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Dominican Republic", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("El Salvador", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Greenland", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Grenada", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Guadeloupe", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Guatemala", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Haiti", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Honduras", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Jamaica", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Martinique", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Mexico", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Montserrat", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Netherlands Antilles", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Nicaragua", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Panama", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Puerto Rico", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("St Barthélemy", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("St Kitts & Nevis", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("St Lucia", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("St Martin (French part)", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("St Pierre & Miquelon", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("St Vincent & the Grenadines", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Sint Maarten (Dutch part)", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Trinidad & Tobago", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Turks & Caicos Islands", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("United States", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("US Minor Outlying Islands", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Virgin Islands, British", NORTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Virgin Islands, U.S.", NORTHAMERICA_DROP_DOWN_XPATH);
		
		
		continent.put("American Samoa", OCEANIA_DROP_DOWN_XPATH);
		continent.put("Australia", OCEANIA_DROP_DOWN_XPATH);
		continent.put("Cook Islands", OCEANIA_DROP_DOWN_XPATH);
		continent.put("Fiji", OCEANIA_DROP_DOWN_XPATH);
		continent.put("French Polynesia", OCEANIA_DROP_DOWN_XPATH);
		continent.put("Guam", OCEANIA_DROP_DOWN_XPATH);
		continent.put("Kiribati", OCEANIA_DROP_DOWN_XPATH);
		continent.put("Maldives", OCEANIA_DROP_DOWN_XPATH);
		continent.put("Marshall Islands", OCEANIA_DROP_DOWN_XPATH);
		continent.put("Nauru", OCEANIA_DROP_DOWN_XPATH);
		continent.put("New Caledonia", OCEANIA_DROP_DOWN_XPATH);
		continent.put("New Zealand", OCEANIA_DROP_DOWN_XPATH);
		continent.put("Niue", OCEANIA_DROP_DOWN_XPATH);
		continent.put("Northern Mariana Islands", OCEANIA_DROP_DOWN_XPATH);
		continent.put("Palau", OCEANIA_DROP_DOWN_XPATH);
		continent.put("Papua New Guinea", OCEANIA_DROP_DOWN_XPATH);
		continent.put("Pitcairn", OCEANIA_DROP_DOWN_XPATH);
		continent.put("Seychelles", OCEANIA_DROP_DOWN_XPATH);
		continent.put("Solomon Islands", OCEANIA_DROP_DOWN_XPATH);
		continent.put("Tonga", OCEANIA_DROP_DOWN_XPATH);
		continent.put("Tuvalu", OCEANIA_DROP_DOWN_XPATH);
		continent.put("Vanuatu", OCEANIA_DROP_DOWN_XPATH);
		continent.put("Wallis & Futuna", OCEANIA_DROP_DOWN_XPATH);
		
		continent.put("Argentina", SOUTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Bolivia, Plurinational State of", SOUTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Brazil", SOUTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Chile", SOUTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Colombia", SOUTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Ecuador", SOUTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Falkland Islands (Malvinas)", SOUTHAMERICA_DROP_DOWN_XPATH);
		continent.put("French Guiana", SOUTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Guyana", SOUTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Paraguay", SOUTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Peru", SOUTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Suriname", SOUTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Uruguay", SOUTHAMERICA_DROP_DOWN_XPATH);
		continent.put("Venezuela", SOUTHAMERICA_DROP_DOWN_XPATH);
		
		
	}
	
	public static String GetContinentXpath(String CountryName)
	{
		String ContinentXpath = continent.get(CountryName);
		return ContinentXpath;
	}
	
	

	
	public static HashMap<String, String> country = new HashMap<String, String>();
	public static void PutCountryInputID()
	{
		country.put("Algeria", "countries_DZ");
		country.put("Angola", "countries_AO");
		country.put("Benin", "countries_BJ");
		country.put("Botswana", "countries_BW");
		country.put("Burkina Faso", "countries_BF");
		country.put("Burundi", "countries_BI");
		country.put("Cameroon", "countries_CM");
		country.put("Cape Verde", "countries_CV");
		country.put("Central African Republic", "countries_CF");
		country.put("Chad", "countries_TD");
		country.put("Comoros", "countries_KM");
		country.put("Congo", "countries_CG");
		country.put("DR Congo", "countries_CD");
		country.put("Côte d'Ivoire", "countries_CI");
		country.put("Djibouti", "countries_DJ");
		country.put("Egypt", "countries_EG");
		country.put("Equatorial Guinea", "countries_GQ");
		country.put("Eritrea", "countries_ER");
		country.put("Ethiopia", "countries_ET");
		country.put("Gabon", "countries_GA");
		country.put("Gambia", "countries_GM");
		country.put("Ghana", "countries_GH");
		country.put("Guinea", "countries_GN");
		country.put("Guinea-Bissau", "countries_GW");
		country.put("Kenya", "countries_KE");
		country.put("Lesotho", "countries_LS");
		country.put("Liberia", "countries_LR");
		country.put("Libya", "countries_LY");
		country.put("Madagascar", "countries_MG");
		country.put("Malawi", "countries_MW");
		country.put("Mauritania", "countries_MR");
		country.put("Mauritius", "countries_MU");
		country.put("Mayotte", "countries_YT");
		country.put("Morocco", "countries_MA");
		country.put("Mozambique", "countries_MZ");
		country.put("Namibia", "countries_NA");
		country.put("Niger", "countries_NE");
		country.put("Nigeria", "countries_NG");
		country.put("Réunion", "countries_RE");
		country.put("Rwanda", "countries_RW");
		country.put("St Helena, Ascension & Tristan da Cunha", "countries_SH");
		country.put("Sao Tome & Principe", "countries_ST");
		country.put("Senegal", "countries_SN");
		country.put("Seychelles", "countries_SC");
		country.put("Sierra Leone", "countries_SL");
		country.put("Somalia", "countries_SO");
		country.put("South Africa", "countries_ZA");
		country.put("South Sudan", "countries_SS");
		country.put("Sudan", "countries_SD");
		country.put("Swaziland", "countries_SZ");
		country.put("Tanzania, United Republic of", "countries_TZ");
		country.put("Togo", "countries_TG");
		country.put("Tunisia", "countries_TN");
		country.put("Uganda", "countries_UG");
		country.put("Western Sahara", "countries_EG");
		country.put("Zambia", "countries_ZM");
		country.put("Zimbabwe", "countries_ZW");
		
		country.put("Afghanistan", "countries_AF");
		country.put("Armenia", "countries_AM");
		country.put("Azerbaijan", "countries_AZ");
		country.put("Bahrain", "countries_BH");
		country.put("Bangladesh", "countries_BD");
		country.put("Bhutan", "countries_BT");
		country.put("British Indian Ocean Territory", "countries_IO");
		country.put("Brunei Darussalam", "countries_BN");
		country.put("Cambodia", "countries_KH");
		country.put("China", "countries_CN");
		country.put("Christmas Island", "countries_CX");
		country.put("Cocos (Keeling) Islands", "countries_CC");
		country.put("Cyprus", "countries_CY");
		country.put("Georgia", "countries_GE");
		country.put("Hong Kong", "countries_HK");
		country.put("India", "countries_IN");
		country.put("Indonesia", "countries_ID");
		country.put("Iran, Islamic Republic of", "countries_IR");
		country.put("Iraq", "countries_IQ");
		country.put("Israel","countries_IL");
		country.put("Jordan", "countries_JO");
		country.put("Kazakhstan", "countries_KZ");
		country.put("Korea PDR", "countries_KP");
		country.put("Korea, Republic of", "countries_KR");
		country.put("Kuwait", "countries_KW");
		country.put("Kyrgyzstan", "countries_KG");
		country.put("Lao PDR", "countries_LA");
		country.put("Lebanon", "countries_LB");
		country.put("Macao", "countries_MO");
		country.put("Malaysia", "countries_MY");
		country.put("Maldives", "countries_MV");
		country.put("Mongolia", "countries_MN");
		country.put("Myanmar", "countries_MM");
		country.put("Nepal", "countries_NP");
		country.put("Oman", "countries_OM");
		country.put("Pakistan", "countries_PK");
		country.put("Palestinian Territory", "countries_PS");
		country.put("Philippines", "countries_PH");
		country.put("Qatar", "countries_QA");
		country.put("Russian Federation", "countries_RU");
		country.put("Saudi Arabia", "countries_SA");
		country.put("Singapore", "countries_SG");
		country.put("Sri Lanka", "countries_LK");
		country.put("Syrian Arab Republic", "countries_SY");
		country.put("Taiwan, Province of China", "countries_TW");
		country.put("Tajikistan", "countries_TJ");
		country.put("Thailand", "countries_TH");
		country.put("Timor-Leste", "countries_TL");
		country.put("Turkey", "countries_TR");
		country.put("Turkmenistan", "countries_TM");
		country.put("United Arab Emirates", "countries_AE");
		country.put("Uzbekistan", "countries_UZ");
		country.put("VietNam", "countries_VN");
		country.put("Yemen", "countries_YE");
		
		country.put("Åland Islands", "countries_AX");
		country.put("Albania", "countries_AL");
		country.put("Andorra", "countries_AD");
		country.put("Armenia", "countries_AM");
		country.put("Austria", "countries_AT");
		country.put("Azerbaijan", "countries_AZ");
		country.put("Belarus", "countries_BY");
		country.put("Belgium", "countries_BE");
		country.put("Bosnia & Herzegovina", "countries_BA");
		country.put("Bulgaria", "countries_BG");
		country.put("Croatia", "countries_HR");
		country.put("Cyprus", "countries_CY");
		country.put("Czech Republic", "countries_CZ");
		country.put("Denmark", "countries_DK");
		country.put("Estonia", "countries_EE");
		country.put("Faroe Islands", "countries_FO");
		country.put("Finland", "countries_FI");
		country.put("France", "countries_FR");
		country.put("Georgia", "countries_GE");
		country.put("Germany", "countries_DE");
		country.put("Gibraltar", "countries_GI");
		country.put("Greece", "countries_GG");
		country.put("Holy See (Vatican City State)", "countries_VA");
		country.put("Hungary", "countries_HU");
		country.put("Iceland", "countries_IS");
		country.put("Ireland", "countries_IE");
		country.put("Isle of Man", "countries_IM");
		country.put("Italy", "countries_IT");
		country.put("Jersey", "countries_JE");
		country.put("Kazakhstan", "countries_KZ");
		country.put("Latvia", "countries_LV");
		country.put("Liechtenstein", "countries_LI");
		country.put("Lithuania", "countries_LT");
		country.put("Luxembourg", "countries_LU");
		country.put("Macedonia (FYR)", "countries_MK");
		country.put("Malta", "countries_MT");
		country.put("Moldova, Republic of", "countries_MD");
		country.put("Monaco", "countries_MC");
		country.put("Montenegro", "countries_ME");
		country.put("Netherlands", "countries_NL");
		country.put("Norway", "countries_NO");
		country.put("Poland", "countries_PL");
		country.put("Portugal", "countries_PT");
		country.put("Romania", "countries_RO");
		country.put("Russian Federation", "countries_RU");
		country.put("San Marino", "countries_SM");
		country.put("Serbia", "countries_RS");
		country.put("Slovakia", "countries_SK");
		country.put("Slovenia", "countries_SI");
		country.put("Spain", "countries_ES");
		country.put("Svalbard & Jan Mayen", "countries_SJ");
		country.put("Sweden", "countries_SE");
		country.put("Switzerland", "countries_CH");
		country.put("Turkey", "countries_TR");
		country.put("Ukraine", "countries_UA");
		country.put("United Kingdom", "countries_GB");
		
		country.put("Anguilla", "countries_AI");
		country.put("Antigua & Barbuda", "countries_AG");
		country.put("Aruba", "countries_AW");
		country.put("Bahamas", "countries_BS");
		country.put("Barbados", "countries_BB");
		country.put("Belize", "countries_BZ");
		country.put("Bermuda", "countries_BM");
		country.put("Bonaire, Sint Eustatius & Saba", "countries_BQ");
		country.put("Canada", "countries_CA");
		country.put("Cayman Islands", "countries_KY");
		country.put("Costa Rica", "countries_CR");
		country.put("Cuba", "countries_CU");
		country.put("Curaçao", "countries_CW");
		country.put("Dominica", "countries_DM");
		country.put("Dominican Republic", "countries_DO");
		country.put("El Salvador", "countries_SV");
		country.put("Greenland", "countries_GL");
		country.put("Grenada", "countries_GD");
		country.put("Guadeloupe", "countries_GP");
		country.put("Guatemala", "countries_GT");
		country.put("Haiti", "countries_HT");
		country.put("Honduras", "countries_HN");
		country.put("Jamaica", "countries_JM");
		country.put("Martinique", "countries_MQ");
		country.put("Mexico", "countries_MX");
		country.put("Montserrat", "countries_MS");
		country.put("Netherlands Antilles", "countries_AN");
		country.put("Nicaragua", "countries_NI");
		country.put("Panama", "countries_PA");
		country.put("Puerto Rico", "countries_PR");
		country.put("St Barthélemy", "countries_BL");
		country.put("St Kitts & Nevis", "countries_KN");
		country.put("St Lucia", "countries_LC");
		country.put("St Martin (French part)", "countries_MF");
		country.put("St Pierre & Miquelon", "countries_PM");
		country.put("St Vincent & the Grenadines", "countries_VC");
		country.put("Sint Maarten (Dutch part)", "countries_SX");
		country.put("Trinidad & Tobago", "countries_TT");
		country.put("Turks & Caicos Islands", "countries_TC");
		country.put("United States", "countries_US");
		country.put("US Minor Outlying Islands", "countries_UM");
		country.put("Virgin Islands, British", "countries_VG");
		country.put("Virgin Islands, U.S.", "countries_VI");
		
		
		country.put("American Samoa", "countries_AS");
		country.put("Australia", "countries_AU");
		country.put("Cook Islands", "countries_CK");
		country.put("Fiji", "countries_FJ");
		country.put("French Polynesia", "countries_PF");
		country.put("Guam", "countries_GU");
		country.put("Kiribati", "countries_KI");
		country.put("Maldives", "countries_MV");
		country.put("Marshall Islands", "countries_MH");
		country.put("Nauru", "countries_NR");
		country.put("New Caledonia", "countries_NC");
		country.put("New Zealand", "countries_NZ");
		country.put("Niue", "countries_NU");
		country.put("Northern Mariana Islands", "countries_MP");
		country.put("Palau", "countries_PW");
		country.put("Papua New Guinea", "countries_PG");
		country.put("Pitcairn", "countries_PN");
		country.put("Seychelles", "countries_SC");
		country.put("Solomon Islands", "countries_SB");
		country.put("Tonga", "countries_TO");
		country.put("Tuvalu", "countries_TV");
		country.put("Vanuatu", "countries_VU");
		country.put("Wallis & Futuna", "countries_WF");
		
		country.put("Argentina", "countries_AR");
		country.put("Bolivia, Plurinational State of", "countries_BO");
		country.put("Brazil", "countries_BR");
		country.put("Chile", "countries_CL");
		country.put("Colombia", "countries_CO");
		country.put("Ecuador", "countries_EC");
		country.put("Falkland Islands (Malvinas)", "countries_FK");
		country.put("French Guiana", "countries_GF");
		country.put("Guyana", "countries_GY");
		country.put("Paraguay", "countries_PY");
		country.put("Peru", "countries_PE");
		country.put("Suriname", "countries_SR");
		country.put("Uruguay", "countries_UY");
		country.put("Venezuela", "countries_VE");
		
		
	}
	
	public static String GetCountryInputID(String CountryName)
	{
		String ContinentXpath = country.get(CountryName);
		return ContinentXpath;
	}









	
	
	public static String getFunctestUrl() {
		return FuncTest_URL;
	}
	public static String getLoginscreenUrl() {
		return LogInScreen_URL;
	}




	public static String getSignOutXpath() {
		return SIGN_OUT_XPATH;
	}
	
	

}
