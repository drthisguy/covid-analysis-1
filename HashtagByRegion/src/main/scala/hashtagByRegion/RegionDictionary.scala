package hashtagByRegion


/** Singleton object that establishes a Map in which each region is the key and
  * each value is a List of country names (as Strings) within that region. 
  * 
  * Also contains methods for working with the Map.
  */
object RegionDictionary {
  private val regionMap = Map (
    "Africa" ->
      List(
        "Algeria",
        "Angola",
        "Benin",
        "Botswana",
        "Burkina Faso",
        "Burundi",
        "Cameroon",
        "Cape Verde",
        "Central African Republic",
        "Chad",
        "Comoros",
        "Cote d'Ivoire",
        "Democratic Republic of the Congo",
        "Djibouti",
        "Egypt",
        "Equatorial Guinea",
        "Eritrea",
        "Ethiopia",
        "Gabon",
        "Gambia",
        "Ghana",
        "Guinea",
        "Guinea-Bissau",
        "Kenya",
        "Lesotho",
        "Liberia",
        "Libya",
        "Madagascar",
        "Malawi",
        "Mali",
        "Mauritania",
        "Mauritius",
        "Morocco",
        "Mozambique",
        "Namibia",
        "Niger",
        "Nigeria",
        "Republic of the Congo",
        "Reunion",
        "Rwanda",
        "Saint Helena",
        "Sao Tome and Principe",
        "Senegal",
        "Seychelles",
        "Sierra Leone",
        "Somalia",
        "South Africa",
        "South Sudan",
        "Sudan",
        "Swaziland",
        "Tanzania",
        "Togo",
        "Tunisia",
        "Uganda",
        "Western Sahara",
        "Zambia",
        "Zimbabwe"
      ),
    "Asia" ->
      List(
        "Afghanistan",
        "Armenia",
        "Azerbaijan",
        "Bahrain",
        "Bangladesh",
        "Bhutan",
        "Brunei",
        "Burma",
        "Cambodia",
        "China",
        "Cyprus",
        "East Timor",
        "Georgia",
        "Hong Kong",
        "India",
        "Indonesia",
        "Iran",
        "Iraq",
        "Israel",
        "Japan",
        "Jordan",
        "Kazakhstan",
        "Kuwait",
        "Kyrgyzstan",
        "Laos",
        "Lebanon",
        "Macau",
        "Malaysia",
        "Maldives",
        "Mongolia",
        "Nepal",
        "North Korea",
        "Oman",
        "Pakistan",
        "Philippines",
        "Qatar",
        "Saudi Arabia",
        "Singapore",
        "South Korea",
        "Sri Lanka",
        "Syria",
        "Taiwan",
        "Tajikistan",
        "Thailand",
        "Turkey",
        "Turkmenistan",
        "United Arab Emirates",
        "Uzbekistan",
        "Vietnam",
        "Yemen"
      ),
    "Caribbean" ->
      List(
        "Anguilla",
        "Antigua and Barbuda",
        "Aruba",
        "The Bahamas",
        "Barbados",
        "Bermuda",
        "British Virgin Islands",
        "Cayman Islands",
        "Cuba",
        "Dominica",
        "Dominican Republic",
        "Grenada",
        "Guadeloupe",
        "Haiti",
        "Jamaica",
        "Martinique",
        "Montserrat",
        "Netherlands Antilles",
        "Puerto Rico",
        "Saint Kitts and Nevis",
        "Saint Lucia",
        "Saint Vincent and the Grenadines",
        "Trinidad and Tobago",
        "Turks and Caicos Islands",
        "U.S. Virgin Islands"
      ),
    "Central America" ->
      List(
        "Belize",
        "Costa Rica",
        "El Salvador",
        "Guatemala",
        "Honduras",
        "Nicaragua",
        "Panama"
      ),
    "Europe" ->
      List(
        "Albania",
        "Andorra",
        "Austria",
        "Belarus",
        "Belgium",
        "Bosnia and Herzegovina",
        "Bulgaria",
        "Croatia",
        "Czech Republic",
        "Denmark",
        "Estonia",
        "Finland",
        "France",
        "Germany",
        "Gibraltar",
        "Greece",
        "Holy See",
        "Hungary",
        "Iceland",
        "Ireland",
        "Italy",
        "Kosovo",
        "Latvia",
        "Liechtenstein",
        "Lithuania",
        "Luxembourg",
        "Macedonia",
        "Malta",
        "Moldova",
        "Monaco",
        "Montenegro",
        "Netherlands",
        "Norway",
        "Poland",
        "Portugal",
        "Romania",
        "Russia",
        "San Marino",
        "Slovak Republic",
        "Slovenia",
        "Spain",
        "Serbia",
        "Serbia and Montenegro",
        "Sweden",
        "Switzerland",
        "Ukraine",
        "United Kingdom"
      ),
    "North America" ->
      List(
        "Canada",
        "Greenland",
        "Mexico",
        "Saint Pierre and Miquelon",
        "United States"
      ),
    "Oceania" ->
      List(
        "American Samoa",
        "Australia",
        "Christmas Island",
        "Cocos (Keeling) Islands",
        "Cook Islands",
        "Federated States of Micronesia",
        "Fiji",
        "French Polynesia",
        "Guam",
        "Kiribati",
        "Marshall Islands",
        "Nauru",
        "New Caledonia",
        "New Zealand",
        "Niue",
        "Northern Mariana Islands",
        "Palau",
        "Papua New Guinea",
        "Pitcairn Islands",
        "Samoa",
        "Solomon Islands",
        "Tokelau",
        "Tonga",
        "Tuvalu",
        "Vanuatu",
        "Wallis and Futuna Islands"
      ),
    "South America" ->
      List(
        "Argentina",
        "Bolivia",
        "Brazil",
        "Chile",
        "Colombia",
        "Ecuador",
        "Falkland Islands",
        "French Guiana",
        "Guyana",
        "Paraguay",
        "Peru",
        "Suriname",
        "Uruguay",
        "Venezuela"
      )
  )


  /** Takes a specific country name as input and returns the region (as a String) that contains that country.
    *
    * @param country The name of the country to be searched for
    * @return The region that contains that country or "Country Not Found"
    */
  def reverseMapSearch(country: String): String = {
    regionMap.foreach( region =>
      if (region._2.contains(country)) {return region._1}
    )
    "Country Not Found"
  }


  /** Returns a full List of country names as Strings.
    *
    * @return List[String] of all countries
    */
  def getRegionList: List[String] = {
      regionMap.keys.toList
  }
}