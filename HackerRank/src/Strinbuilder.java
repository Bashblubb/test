
public class Strinbuilder {

	public static void main(String[] args) {
		 StringBuilder sb = new StringBuilder();
	        sb.append("select * from (");
	        sb.append("  select");
	        sb.append("    delta.PARTNER_ID, bv.ID, bv.IBAN, bv.SWIFT_CODE, nvl(trim(bv.ABW_KONTOINHABER), ''), bv.BANKNAME, nvl(bv.HAUPTKONTO_KZ, 0) HAUPTKONTO_KZ, null,");
	        sb.append("    '0' as REFNR");
	        sb.append("  from EBA_ZVS.BANKVERBINDUNG bv");
	        sb.append("  inner join SST_ZVS_PARTNER_DELTA delta on delta.PARTNER_ID = bv.PARTNER_ID");
	        sb.append("  union");
	        sb.append("  select");
	        sb.append("    delta.PARTNER_ID, null as ID, bv.IBAN, bv.SWIFT_CODE, nvl(trim(bv.ABW_KONTOINHABER), ''), bv.BANKNAME, decode(bv.HAUPT_BV, 'J', 1, 0), bv.ID,");
	        sb.append("    bv.MANDANT || bv.ZGPNR as REFNR");
	        sb.append("  from SST_ZVS_BANKVB bv");
	        sb.append("  inner join EBA_ZVS.PARTNER_ZGP_NR ppb on ppb.ZGP_NR = bv.ZGPNR");
	        sb.append("  inner join SST_ZVS_PARTNER_DELTA delta on delta.PARTNER_ID = ppb.PARTNER_ID");
	        sb.append("  where bv.VALID = 1");
	        sb.append(")");
	        sb.append("where IBAN <> '' and IBAN is not null ");
	        sb.append("order by PARTNER_ID, REFNR, HAUPTKONTO_KZ desc");
  
	        System.out.println(sb);

	}

}
