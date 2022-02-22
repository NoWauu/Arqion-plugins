package fr.nowayy.arqioncore.utils;

public enum Messages {
	
	Enabling_Plugin					("Le plugin a �t� activ�"),
	Disabling_Plugin				("Le plugin a �t� d�sactiv�"),
	
	FlySpeed_ChangingYourself		("�aVous volez d�sormais � : �e{@FlySpeed}"),
	FlySpeed_ChangingOther			("�aLe joueur �6{@target} �avole d�sormais � la vitesse �e{@FlySpeed}"),
	
	WalkSpeed_ChangingYourself		("�aVous marchez d�sormais � la vitesse : �e{@WalkSpeed}"),
	WalkSpeed_ChangingOther			("Le joueur �6{@target} �amarche d�sormais � la vitesse de : �e{@WalkSpeed}"),
	
	Speed_ChangingError				("�cVous ne pouvez pas utiliser cette valeur en tant que multiplicateur de vitesse !"),
	
	Error_PlayerNotFound			("�cLe joueur �6{@target} �cn'est pas connect� !"),
	Error_HomeDontExists			("�cLe home �e{@Home} �cn'existe pas !"),
	Error_WarpDontExists			("�cLe warp �e{@WarpName} �cn'existe pas !"),
	Error_WorldDontExists			("�cLe monde �e{@WorldName} n'existe pas !"),
	Error_EmptyHandToEnchant		("�cVous ne pouvez pas enchanter votre main !"),
	Error_ArgumentsMissing			("�cIl manque le nom du warp !"),
	Error_NoWarps					("�cIl n'y a aucun warp de cr�� !"),
	
	Home_TeleportYourself			("�aVous venez d'�tre t�l�port� au home �e{@HomeName}"),
	Home_TeleportOther				("�aVous venez de t�l�porter �6{@target} �aau home �e{@HomeName}"),
	
	Home_Set						("�aLe home �e{@HomeName} �avient d'�tre d�fini sur votre position."),
	Home_Del						("�aLe home �e{@HomeName} �avient d'�tre supprim�."),
	Warp_Set						("�aLe warp �e{@WarpName} �avient d'�tre d�fini sur votre position."),
	Warp_Del						("�aLe warp �e{@WarpName} �avient d'�tre supprim�."),
	
	Fly_ChangeStateToOnYourself		("�aVous pouvez d�sormais voler !"),
	Fly_ChangeStateToOnOther		("�aLe joueur �6{@target} �apeut d�sormais voler !"),
	Fly_ChangeStateToOffYourself	("�aVous ne pouvez plus voler !"),
	Fly_ChangeStateToOffOther		("�aLe joueur �6{@target} �ane peut plus voler !"),
	
	GodMod_ChangeState_ToOnYourself	("�aVous �tes d�sormais invuln�rable !"),
	GodMod_ChangeState_ToOnOther	("�aLe joueur �6{@target} �aest d�sormais invuln�rable !"),
	GodMod_ChangeState_ToOffYourself("�aVous n'�tes plus invuln�rable !"),
	GodMod_ChangeState_ToOffOther	("�aLe joueur �6{@target} �an'est plus invuln�rable !"),
	
	PlayerInfo_CannotInspect		("�cVous ne pouvez pas inspecter le joueur �e{@target}"),
	
	Heal_Yourself					("�aVous avez �t� gu�ri !"),
	Heal_Other						("�aLe joueur �6{@target} �aa �t� gu�ri"),
	Heal_ErrorFullHealth			("�cVous ne pouvez pas gu�rir �6{@target} �ccar sa vie est d�j� pleine !"),
	
	Feed_Yourself					("�aVous avez �t� nourri !"),
	Feed_Other						("�aLe joueur �6{@target} �aa �t� nourri !"),
	Feed_ErrorFullFood				("�cVous ne pouvez pas nourrir �6{@target} �ccar il est d�j� rassasi� !"),
	
	KillAll_All						("�aVous avez tu� toutes les entit�s du monde �6{@world}"),
	KillAll_HostilesEntities		("�aVous avez tu� toutes les entit�s hostiles du monde �6{@world}"),
	KillAll_AnimalsEntities			("�aVous avez tu� toutes les entit�s pacifiques du monde �6{world}"),
	KillAll_MinecartEntities		("�aVous avez tu� tous les minecarts du monde �6{world}"),
	KillAll_ArrowEntities			("�aVous avez tu� toutes les fl�ches du monde �6{world}"),
	
	NonPlayerSender_Error			("�cCette commande ne peut �tre ex�cut�e que par un joueur !"),
	
	GameMode_SetYourself			("�cVous avez d�sormais le mode de jeu : �e\"{@GameMode}\""),
	GameMode_SetOther				("�cLe mode de jeu de �6{@target} �cest maintenant : �e{@GameMode}");
	
	
	public String fr_FR;
	
	private Messages(String fr_FR) {
		this.fr_FR = fr_FR;
	}
	
	@Override
    public String toString() {
        return this.fr_FR;
    }
}
