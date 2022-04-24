
public class match {
	public String checkTarget(Player player) throws Exception {

		int requiredRuns = player.requiredRuns;
		char[] overSummary = player.summary.toCharArray();

		int runsScored = 0;
		for (char ball : overSummary) {
			if (ball == 'W' && runsScored < requiredRuns) {
				throw new MatchException("Out");
			} else {
				runsScored = runsScored + Integer.parseInt(String.valueOf(ball));
			}
		}

		if (runsScored < requiredRuns) {
			throw new MatchException("Lost by runs");
		}

		return "We may win";

	}

	public String results(Player player) throws Exception {
		try {
			checkTarget(player);
			return "We won";
		} catch (MatchException e) {
			return "We lost";
		} catch (Exception e) {
			return "Other exception";
		}
	}

	public static void main(String[] args) throws Exception {
		Player p = new Player(12, "123461");
		Match m = new Match();
		String s = m.checkTarget(p);
		String t = m.results(p);
		System.out.println(s.toLowerCase());
		System.out.println(t.toLowerCase());
	}
	}
	class MatchException extends Exception {
		public MatchException(String msg) {
			
		}
	}
	public class Player {
		int requiredRuns;
		String summary;

		public Player(int requiredRuns, String summary) {
			this.requiredRuns = requiredRuns;
			this.summary = summary;
		}
	}

}


}
