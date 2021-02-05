object Terms {

  def getCovidTerms: Set[String] = {
    covidTerms
  }

  def getOtherTerms: Set[String] = {
    otherTerms
  }

  private val covidTerms = Set(
    "Coronavirusmexico",
    "新冠病毒",
    "2019_ncov",
    "mp927",
    "covid2019",
    "21dayslockdown",
    "mpdafome",
    "coronavirususa",
    "新冠肺炎",
    "5baje5minute",
    "mpdamorte",
    "covid_19uk",
    "9minute9baje",
    "mpdobolsonaro",
    "covid-19uk",
    "新型コロナウイルス",
    "9minutesforindia",
    "mumbailockdown",
    "Briefing_COVID19",
    "新型冠状病毒",
    "9बजे9मिनट",
    "n95",
    "coronaapocolypse",
    "AislamientoObligatorio",
    "NeuerCoronavirusSchweiz",
    "coronavirusbrazil",
    "aksiberantasCovid19",
    "NoAlAislamientoInteligente",
    "marchapelocorona",
    "武汉加油",
    "AlertaCOVID19SV",
    "NotDying4WallStreet",
    "coronavirusbrasil",
    "武汉疫情",
    "ampliarlacuarentenaes",
    "notessential",
    "coronaday",
    "武汉肺炎",
    "auxilioemergencial",
    "obrasilnaopodeparar",
    "LockdownLife",
    "coronafest",
    "BersamaMelawanCorona",
    "OBrasilnaoVaiParar",
    "LockdownExtended",
    "coronavirusu",
    "武漢肺炎",
    "bersatulawancovid19",
    "obrasilvaiparar",
    "lockdowneffect",
    "covid2019pt",
    "bloqueioderuas",
    "OneTeamFromHome",
    "mortonaocompra",
    "COVID19PT",
    "Bogotaencasa",
    "onlineclasses",
    "isolamentoparcial",
    "caronavirususa",
    "疫情",
    "bolsonarogenocida",
    "ParemosElVirus",
    "covid19india",
    "CoronaAlert",
    "BreakCorona",
    "PMCares",
    "lockdownparcial",
    "caronavirusindia",
    "coronavirusUP",
    "cadeostestes",
    "PPE",
    "mortonaovota",
    "caronavirusoutbreak",
    "coronavirustelangana",
    "californialockdown",
    "ppeshortage",
    "caronavirus",
    "coronaviruskerala",
    "californiaquarantine",
    "pralernaquarentena",
    "coronavirusmumbai",
    "californiashutdown",
    "PrioridadDineroOSalud",
    "UnitedAgainstCoronavirus",
    "2019nCoV",
    "coronavirusdelhi",
    "calockdown",
    "QuarantineMoneyMakingIdeas",
    "CovidISSNAF",
    "coronavirusmaharashtra",
    "capitaocorona",
    "quaratinelife",
    "codvid_19",
    "coronavirusinindia",
    "CegahTangkalCorona",
    "quarentenabrasil",
    "codvid19",
    "chegadequarentena",
    "quarentenaLGBTQ",
    "conronaviruspandemic",
    "covid_19ind",
    "clapforourcarers",
    "quarentenou",
    "corona",
    "covid19india",
    "ClubQuarantine",
    "quaretenabrasil",
    "CoronaChainScare",
    "QuaronaVirus",
    "coronavirusindia",
    "CoronaCitizenResponsibility",
    "ReceitasDaQuarentena",
    "कोविड_19",
    "CoronaCrises",
    "remdesivir",
    "coronadeutschland",
    "कोविड-१९",
    "coronacrises",
    "SCNaoQuerMorrer",
    "Coronaferien",
    "कोरोनावायरस",
    "CoronaCrisis",
    "selfemployedmattertoo",
    "coronaflu",
    "bayarealockdown",
    "coronafreepakistan",
    "SendUsBackHome",
    "coronaoutbreak",
    "stayathomechallenge",
    "CoronaInPakistan",
    "ShamblesStayAtHome",
    "coronapandemic",
    "stayhomechallenge",
    "coronakrise",
    "sideeffectsofquarantinelife",
    "Coronapanik",
    "quarantinelife",
    "coronalockdown",
    "Social_Distancing",
    "coronapocalypse",
    "dontbeaspreader",
    "coronanasperiferias",
    "sosecuador",
    "CoronaSchlager",
    "stayhomechallenge",
    "coronapandemie",
    "spcontraocoronavirus",
    "coronavid19",
    "howtokeeppeoplehome",
    "coronapandemie",
    "SRKDonatesForCovid",
    "coronavid19",
    "togetherathome",
    "CoronaStopKaroNa",
    "stayathomeorder",
    "Coronavirus",
    "coronaupdate",
    "StayAtHomeReadABook",
    "coronaupdatesindia",
    "StayAtHomeSaveLives",
    "coronavirusargentina",
    "alcoolemgel",
    "CoronaVillains",
    "stayhomestaysafe",
    "coronavirusbrasil",
    "alcoolgel",
    "coronaviru",
    "suspendonlineclasses",
    "CoronaVirusCanada",
    "avoidcrowds",
    "CoronavirusBillUK",
    "taxarfortunassalvarvidas",
    "coronaviruschile",
    "CoronaVirusFromMinorChastisement",
    "TaxarFortunasSalvarVidas",
    "coronaviruscolombia",
    "coronavirusinsa",
    "TaxarFortunasSalvarVidas",
    "CoronaVirusDE",
    "coronavirusitalia",
    "testesmasivosja",
    "coronavirusecuador",
    "canceleverything",
    "coronavirusitaly",
    "testesmassivosja",
    "CoronavirusEnColombia",
    "CerradMadridYa",
    "coronaviruslombardia",
    "ThaliBajao",
    "coronavirusespana",
    "coronavirusoubreak",
    "thankyouwarriors",
    "CLOSENYCPUBLICSCHOOLS",
    "coronavirusplantao",
    "UKCoronavirusBill",
    "CoronavirusFR",
    "confinementtotal",
    "CoronavirusPlantao",
    "uklockdown",
    "coronavirusIndonesia",
    "CONVID19",
    "CoronaVirusSA",
    "UNExigimosGarantiasLaborales",
    "Coronavirusireland",
    "CoronavirusESP",
    "CoronavirusSchweiz",
    "unidosvenceremos",
    "CoronaVirusIreland",
    "coronavirussouthafrica",
    "UNSuspendanClasesOParamos",
    "coronavirusmadrid",
    "cuarentena",
    "CoronavirusSuisse",
    "unsuspendanclasesya",
    "coronavirusmexico",
    "CuarentenaCoronavirus",
    "CoronavirusSwitzerland",
    "UNSuspendanlasClasesOParamos",
    "coronavirusnobrasil",
    "cuarentenaYA",
    "coronavoucher",
    "usemascara",
    "coronavirusnyc",
    "coronawarriors",
    "vaipassar",
    "coronavirusoutbreak",
    "coronawarriors",
    "vegasshutdown",
    "coronavirusoutbreak",
    "DontBeASpreader",
    "coronazeit",
    "viviremosyvenceremos",
    "coronaviruspandemic",
    "donttouchyourface",
    "coronovirus",
    "VivirEnCuarentenaEs",
    "coronavirusperu",
    "coronvirus",
    "WarAgainstVirus",
    "coronaviruspuertorico",
    "corronavirus",
    "waragainstvirus",
    "coronavirusrd",
    "Covid19_CH",
    "wearamask",
    "coronavirustruth",
    "covid19brasil",
    "WhenCoronaVirusIsOver",
    "coronavirusuk",
    "euficoemcasa",
    "Covid19CH",
    "WhoPaysForCovid",
    "covid19ecuador",
    "WorkingFromHomeLife",
    "coronavirusupdates",
    "ficaemcasa",
    "Covid19InSA",
    "workingfromhometips",
    "coronavirusuruguay",
    "COVID19italia",
    "अंधेर_नगरी_चौपट_राजा",
    "covid19out",
    "मोदीजी_हम_दीप_नहीं_जलाएंगे",
    "flatteningthecurve",
    "Covid19Schweiz",
    "ウイルス付着",
    "Corvid19virus",
    "flattenthecurve",
    "covid19southafrica",
    "うちで過ごそう",
    "covd19",
    "FrenaLaCurva",
    "covidactnow",
    "おうち時間",
    "covid",
    "covideos",
    "コロナに負けるな",
    "Handsanitizer",
    "covididiots",
    "コロリンピック",
    "covid",
    "HoldTheVirus",
    "covidiots",
    "ステイホーム",
    "covidsafe",
    "ソーシャルディスタンス",
    "lavatumanos",
    "CuarentenaHastaJunioEs",
    "ロックダウン",
    "covid_19",
    "CuarentenaInformando",
    "外出禁止",
    "covid_19",
    "laveasmaos",
    "cuarentenametadata",
    "外出自粛",
    "lockdown",
    "cubaporlasalud",
    "新しい生活様式",
    "COVID_19uk",
    "cubasalvavidas",
    "東京コロリンピック",
    "covid19",
    "pandemic",
    "CubriendoElCoronavirus",
    "特別定額給付金",
    "CurfewInIndia",
    "緊急事態宣言",
    "panicbuying",
    "CurfewInIndia",
    "covid19Canada",
    "panickbuing",
    "CuronaVairus",
    "curonavirus",
    "quarantine",
    "depoisdaquarentenaeu",
    "covid19espana",
    "dirumahaja",
    "covid19france",
    "QuarantineAndChill",
    "disciplinaparavolver",
    "covid19Indonesia",
    "disiplincegahcorona",
    "covid19ireland",
    "ecuadorencrisis",
    "covid19uk",
    "quarentena",
    "ecuadorenemergencia",
    "covid19usa",
    "quarentine",
    "eunaquarentena",
    "covid2019",
    "quarentined",
    "FightCoronaWithJokowi",
    "ForcaCoronaVirus",
    "fiqueemcasa",
    "infocoronavirus",
    "quarentinelife",
    "FlexibilizarElAislamientoEs",
    "kamitidaktakutviruscorona",
    "quedateencasa",
    "frontline_warriors_intern",
    "nCoV",
    "remotework",
    "frontlineheroes",
    "remoteworking",
    "frontlineworkers",
    "ncov2019",
    "frontlineworkersappreciation",
    "GerakanSocialDistancing",
    "homeschool",
    "NeuerCoronavirus",
    "selfisolating",
    "homeschooling",
    "SiMeContagioYo",
    "HomeTasking",
    "NouveauCoronavirus",
    "hydroxychloroquine",
    "socialdistance",
    "indiafightcorona",
    "NovelCorona",
    "socialdistancing",
    "indiaprotectdoctors",
    "socialdistancingnow",
    "indonesialawancorona",
    "novelcoronavirus",
    "socialdistnacing",
    "indonesialawancovid19",
    "NovelCoronavirus",
    "stayathome",
    "JagaDiriJagaJarak",
    "NuovoCoronavirus",
    "stayathome",
    "JanataCurfewMarch22",
    "ohiocoronavirus",
    "stayhome",
    "JantaCurfewChallenge",
    "PánicoPorCoranovirus",
    "stayhome",
    "KanikaCoronaRow",
    "SARSCoV2",
    "stayhomechallenge",
    "KanikaKaCoronaCrime",
    "SARSCoV2",
    "stayhomesavelives",
    "koronaindonesia",
    "StayTheFHome",
    "koronavirusIndonesia",
    "thecoronas",
    "StayTheFuckHome",
    "LaPrevenciónEstáEnTusManos",
    "trumpdemic",
    "suspendanlasclases",
    "LawanCorona",
    "LawanCoronaBersama",
    "viruscorona",
    "teletrabajo",
    "lawancovid19",
    "ToiletPaperApocalypse",
    "LawanCovid19",
    "فيروس_كورونا",
    "toiletpaperpanic",
    "LetsDefeatCOVID19Together",
    "كورونا",
    "Lockdowhustle",
    "كورونا_الجديد",
    "lockdown21",
    "कोरोना",
    "trabajardesdecasa",
    "LockdownEnd",
    "LockdownNow",
    "lockdowntillmay3",
    "कोरोना_वायरस",
    "losangeleslockdown",
    "mascaras",
    "코로나",
    "washurhands",
    "mascarasalva",
    "코로나19",
    "washyourhands",
    "mascarilla",
    "WashYourHandsAgain",
    "mascarillas",
    "코로나바이러스",
    "wfh",
    "mascarillassolidarias",
    "masks4all",
    "コロナ",
    "workfromhome",
    "maskuplagos",
    "コロナウイルス",
    "micasaesmiplaza",
    "workingfromhome",
    "michiganshutdown",
    "加油武汉",
    "yomequedoencasa",
    "ModiKiBaatMano"
  )
  private val otherTerms = Set(
    "to",
    "you",
    "your",
    "the",
    "a",
    "of",
    "and",
    "that",
    "it",
    "in",
    "is",
    "for",
    "on",
    "are",
    "if",
    "can",
    "be",
    "as",
    "have",
    "with",
    "this",
    "is",
    "or",
    "but",
    "they",
    "will",
    "what",
    "at",
    "my",
    "rt",
    "do",
    "not",
    "an",
    "them",
    "from",
    "how",
    "there",
    "so",
    "by",
    "there",
    "when",
    "than",
    "also",
    "was",
    "any"
  )

}

