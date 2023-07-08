package Battle.Constants;

public enum Characters {

    ARIA(true,
            "Aria Doom", "Aria D. era filha única de uma das famílias mais renomadas de Ezus. Desde pequena, Aria fora educada com muitas expectativas,\ne todos que não possuíssem o sangue dos Doom, eram tratados como inferiores. Aria não era capaz de reconhecer as diferenças e sempre\nbuscava uma forma de vangloriar a si mesma. Sua mãe havia morrido em seu parto, então sempre viveu às sombras de seu pai, cujo\nensinamentos transformaram a doce garota em uma narcisista completa. A paz que Aria conhecia fora brutalmente interrompida quando um\nevento trágico ocorreu, a família Doom fora acusada de ser discípula do Lorde Graf, um ser demoníaco capaz de transferir parte de\nsua energia aos seus adeptos, chamados Bestas Maculadas. Aria conseguiu escapar, mas sua família não, a qual foi condenada à morte.",
            10,
            2, 1, 4,
            new Abilities[]{Abilities.ATTACK, Abilities.PUNCH, Abilities.GRACE}
    ),

    DAMIEN(true, "Damien", "Damien era um Rejeitado, cidadão da parte oculta da civilização de Ezus. Por ser descendente de um dos 21 Generais\nda Fome, Damien não era capaz de viver uma vida tranquila. Seus pais foram sentenciados à morte pela falsa acusação de serem\nBestas Maculadas e foram mortos quando Damien tinha 12 anos. Essa terrível perda marcou profundamente sua alma e fez com que\nDamien desistisse de sua própria felicidade e odiasse profundamente a sociedade de Ezus. Guiado por um desígnio inabalável,\nDamien conheceu o Eremita da Loucura, um sábio capaz de oferecer ao indivíduo a possibilidade de controlar o Ego, e, confiante\nde suas escolhas, aceitou a oferta sem relutâncias.",
            10,
            2, 2, 3,
            new Abilities[]{Abilities.ATTACK, Abilities.PUNCH, Abilities.EGO}
    ),

    THORFFY(false, "Thorffy, o Guardião de Sétiah", "",
            10,
            1, 2, 2,
            new Abilities[]{Abilities.MALICIOUSATTACK, Abilities.BADHEALING, Abilities.SHOUT}

    ),

    ZIGG(false, "Zigg, o Lacaio de Graf", "",
            10,
            2, 3, 3,
            new Abilities[]{Abilities.MALICIOUSATTACK, Abilities.BADHEALING, Abilities.FEAR}

    ),

    LORDGRAF(false, "Lorde Graf", "s",
            10,
            3, 4, 4,
            new Abilities[]{Abilities.MALICIOUSATTACK, Abilities.BADHEALING, Abilities.MANIPULATION}
    );

    public final boolean IS_PLAYABLE;
    public final String NAME, STORY;
    public final int SANITY, STRENTGH, RESISTENCE, AGILITY;
    public final Abilities[] ABILITIES;

    Characters(boolean isPlayable, String name, String story, int sanity, int strengh, int resistence, int agility, Abilities[] abilities) {
        this.IS_PLAYABLE = isPlayable;
        this.NAME = name;
        this.STORY = story;
        this.SANITY = sanity;
        this.STRENTGH = strengh;
        this.RESISTENCE = resistence;
        this.AGILITY = agility;
        this.ABILITIES = abilities;
    }
}
