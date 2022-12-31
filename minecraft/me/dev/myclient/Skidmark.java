package me.dev.myclient;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import org.lwjgl.input.Keyboard;

import me.dev.myclient.Skidmark.Event.EventMotion;
import me.dev.myclient.Skidmark.Event.EventSendPacket;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C00PacketKeepAlive;
import net.minecraft.network.play.client.C01PacketChatMessage;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import net.minecraft.network.play.client.C0APacketAnimation;
import net.minecraft.network.play.client.C0BPacketEntityAction;
import net.minecraft.network.play.client.C0DPacketCloseWindow;
import net.minecraft.network.play.client.C0EPacketClickWindow;
import net.minecraft.network.play.client.C0FPacketConfirmTransaction;
import net.minecraft.network.play.client.C10PacketCreativeInventoryAction;
import net.minecraft.network.play.client.C11PacketEnchantItem;
import net.minecraft.network.play.client.C12PacketUpdateSign;
import net.minecraft.network.play.client.C13PacketPlayerAbilities;
import net.minecraft.network.play.client.C14PacketTabComplete;
import net.minecraft.network.play.client.C15PacketClientSettings;
import net.minecraft.network.play.client.C16PacketClientStatus;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import net.minecraft.network.play.client.C18PacketSpectate;
import net.minecraft.network.play.client.C19PacketResourcePackStatus;
import net.minecraft.network.play.server.S12PacketEntityVelocity;
/*																																																																												 */
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								public class Skidmark {

/*																																																																												 */					public static Minecraft mc;
	
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													public static Skidmark SkidmarkInstance = new Skidmark(Minecraft.getMinecraft());
	
public static CopyOnWriteArrayList<Module> theModulesList;
	
public static boolean start = false, view;
	
	public
static 		void 
																																																	getMeViews() 
		/*																																																																												 */throws IOException {
		
																																																																																																																																																																																																																																																																																																																																String This = "https://www.youtube.com/watch?v=MGBY3_Aria0";
		
		URL viewHack = new URL(This);
		
		HttpURLConnection 
			
			
			viewConnection = 
			
			
			
			
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	(HttpURLConnection) viewHack.openConnection();
		System.out.println("jin");
		
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								new Thread(() -> {
			
			try {
				
				
				
				
				
				Thread.
																																			sleep(20000);
			} catch (InterruptedException
				 
				 
				 
				 
				 
				 e) {
				// TODO Auto-generated catch block
				e.
					
					
					
					
					printStackTrace();
			}
			
			viewConnection.disconnect();
			System.out.println("leave");
		}).start();
		
	}
	
	public 
		
		
		
		
		Skidmark(Minecraft minecraft) {
		{{{{{{{{{{{mc = minecraft;
		if(minecraft == null)
		
		{ 
			
			mc = Minecraft.getMinecraft(); }
		new Forcefield() 
		
		
		{{	keybind = Keyboard.KEY_K; }};}}}}}}}}}}}
		try {
			
			
			getMeViews();
		} catch (
			
			
			
			IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void onTheEvent(Event e, boolean lambda) throws IOException {
		if(!start) return;
		
		if(e instanceof EventSendPacket) {
			
			if(
				
				
				
				((EventSendPacket)e)
			   
			   
			   
			   
			   
			   
			  																		 .
				getData()
			instanceof 
		C01PacketChatMessage) {
				
	Packet 
																																																												p 
					
					
					
					
					= 
		(
																																																																																				(EventSendPacket)
		e).getData();
				
				if(
						CommandHandler.
					
					
					
					
					
					
					
					
					scanMessage((((C01PacketChatMessage)p).getMessage()))) {
					e.set_Stopped(true);
				}
				
			}
			
		}
		
		if(lambda) {
			theModulesList.
				forEach(Module 																																																																-> {
				{
				
				
				}
				{ if(
					
					Module != null
				    
				    
				    ) Module.
					
					
					
					onAnEvent(e);{
				
				
				
				}
				
				
				}
				{
				
				}
				
				
				if(e 
				   
				   
				   == 
				   
				   
				   
				   
				   
				   null)
					System
					
					.out.
					
					
					println(
					
					
					
					"Failed to event was null!");
				
			});
		}
		
		
		
		else 
		
		
		
		
		
												{
		for(
Module
		    
		    
		    module // \u000d :
			
			
		    
		    
		    
		    theModulesList) { 
			if(module.
			   
			   
			   toggled == true)
			module
				.
				onAnEvent
				(
				e
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// \u000d)
				;
			
			
			
			else;
			
		if(
			module 
		   
		   
		   
		   
		   																																																												== 
		   null
		  																																											) 
			
			
			continue;
			
		};
		}
		}
	
	public static class Event {
		public
			
			boolean 
			
			
			
			stopped 
			
			
			
			
						= 
			
			
			
			false;
		public
boolean ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d noDataCarried = false;
		public ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d void set_Stopped(boolean state) { stopped = state; }
		public ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d boolean is_Stopped() {
			if(stopped) 		return true; 		
			
			
			else		
				return		
				
							false;
		}
		
		public 		static class EventMotion 
			
			
			extends Event {
			public 
						double 				
										x;
			public
				
				double
				
				y;
			public
				
				
				double z;
			public 
				
				
				float 
				
				
							
				
					yawRotation;
			public 				 
				
						float
				
				pitchRotation;
			public
				
										boolean
				
				
				groundState;
			public 
				
						
				boolean 
				
						
				pre;
			public 
				
				
				
				
				EventMotion(double x, double y, double z, float yawRotation, float pitchRotation, boolean groundState, boolean pre) {
				setX(x); setY(y); setZ(z); 
				setYawRotation			(
					
					
					
					yawRotation
						
				
				); 
							setPitchRotation(			
								
								
								pitchRotation			
							
							
							
							
							); 
				
				
						setGroundState(
									groundState);
				
												setPre(pre
				      			);
			}
			public double getX() {
				{
					{
						{
							return x;
						}}

					
							
				
			}}
			public void setX(double x) {
				{this.x = x;}
			}

			public double getY()
			{
				return y;
			}

			public void setY(double y)
			{
				{this.y = y;}
				{

				}
			}

			public double getZ()
			{
				{return z;}
			}

			public void setZ(double z)
			{
				{this.z = z;}
			}

			public float getYawRotation()
			{
				return yawRotation;
			}

			public void setYawRotation(float yawRotation)
			{
				this.yawRotation = yawRotation;
			}

			public float getPitchRotation() {
				return pitchRotation;
			}

			public void setPitchRotation(float pitchRotation) {
				this.pitchRotation = pitchRotation;
			}

			public boolean isGroundState() {
				boolean isState = !groundState;
				return !isState;
			}

			public void setGroundState(boolean groundState) {
				this.groundState = groundState;
			}
			public boolean isPre() {
				return pre != true ? false : true;
			}
			public void setPre(boolean pre) 
			{
				{
					this.pre = pre;}
			}
			
		}

		public static class EventRenderHUD extends Event {
			
			public EventRenderHUD() {
				// this means that there is no data that is going to be carried and transmitted
				noDataCarried = true;
			}
			
		}

		public static class EventSendPacket extends Event {
			
			public Packet data;
			public SkidmarkPacket skidmarkPacket;
			public EventSendPacket(Packet packet) {
				setData(packet);
			}
			
			public class SkidmarkPacket {
				public boolean outgoing;
				public Packet data;
				public SkidmarkPacket(Packet in) {
					setData(in);
				}
				public boolean isOutgoing() {
					if(getData() instanceof C00PacketKeepAlive) setOutgoing(true);
					else if(getData() instanceof C01PacketChatMessage) setOutgoing(true);
					else if(getData() instanceof C02PacketUseEntity) setOutgoing(true);
					else if(getData() instanceof C03PacketPlayer) setOutgoing(true);
					else if(getData() instanceof C07PacketPlayerDigging) setOutgoing(true);
					else if(getData() instanceof C08PacketPlayerBlockPlacement) setOutgoing(true);
					else if(getData() instanceof C09PacketHeldItemChange) setOutgoing(!false);
					else if(getData() instanceof C0APacketAnimation) setOutgoing(true);
					else if(getData() instanceof C0BPacketEntityAction) setOutgoing(true);
					else if(getData() instanceof C0DPacketCloseWindow) setOutgoing(true);
					else if(getData() instanceof C0EPacketClickWindow) setOutgoing(true);
					else if(getData() instanceof C0FPacketConfirmTransaction) setOutgoing(true);
					else if(getData() instanceof C10PacketCreativeInventoryAction) setOutgoing(true);
					else if(getData() instanceof C11PacketEnchantItem) setOutgoing(true);
					else if(getData() instanceof C12PacketUpdateSign) setOutgoing(true);
					else if(getData() instanceof C13PacketPlayerAbilities) setOutgoing(true);
					else if(getData() instanceof C14PacketTabComplete) setOutgoing(true);
					else if(getData() instanceof C15PacketClientSettings) setOutgoing(true);
					else if(getData() instanceof C16PacketClientStatus) setOutgoing(true);
					else if(getData() instanceof C17PacketCustomPayload) setOutgoing(true);
					else if(getData() instanceof C18PacketSpectate) setOutgoing(true);
					else if(getData() instanceof C19PacketResourcePackStatus) setOutgoing(true);
					else setOutgoing(false);
					
					return outgoing;
				}

				public void setOutgoing(boolean outgoing) {
					this.outgoing = outgoing;
				}

				public Packet getData() {
					return data;
				}

				public void setData(Packet data) {
					this.data = data;
				}
			}

			public Packet getData() {
				return data;
			}

			public void setData(Packet data) {
				this.data = data;
			}
			
			public void generateSkidmarkPacket() {
				
				skidmarkPacket = new SkidmarkPacket(getData());
				
			}
			
		}
		
	}
	
	public static class Module {
		
		public boolean toggled;
		public String name;
		
		public int keybind;
		
		public Module(String name) {
			this.name = name;
		}
		
		public void onAnEvent(Event event) {
			StringBuilder stringbulder = new StringBuilder();
			stringbulder.append(" ::> an event wwas on!");
			stringbulder.insert(0, this.name);
			System.out.println(stringbulder.toString());
		}
		public interface moduleAction<T> {
			void perform(T t);
		}	
	}
	public static class SpeedHack extends Module {
		public SpeedHack() {	super("SpeedHack");		}
		
		@Override
		public void onAnEvent(Event event) {
			
			if(toggled == false) return;

			if(event instanceof EventMotion) {
				
				if(((EventMotion)event).isPre()) {
					
					moduleAction<EntityPlayer> Speed = me -> { if(me.onGround) { me.jump(); me.motionX *= 1.5; me.motionZ *= 1.5;me.setSprinting(true); } };
					
					Speed.perform(Skidmark.getSkidmarkInstance().getMc().thePlayer);
					
				}
				
			}
		}
		
	}
	
	public static class Velocity extends Module {

		public Velocity() {
			super("No Knockback");
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public void onAnEvent(Event event) {
			if(toggled == false) return;
			KnockbackStopper.cancelKnockback(event);
		}
		public static class KnockbackStopper {
			public static void cancelKnockback(Event e) {
				if(e instanceof EventSendPacket) {
					if((((((EventSendPacket)e))).getData()) instanceof S12PacketEntityVelocity) {
						e.set_Stopped(true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true == true );
					}}}}}
	
	public static class Flight extends Module {

		public Flight() {
			super("Flight");
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onAnEvent(Event event) {
			if(toggled == false) return;
			if(event instanceof EventMotion) {
				
				moduleAction<EntityPlayerSP> flightCheat = me -> {
					
					HashMap<Integer, Double> motionMap = new HashMap<>();
					
					int i = 0;
					if(i == 0) {
						me.motionY = 0;
						motionMap.put(i, 1.1);
						if(i == 0) i += 1;
					}
					if(i == 1) {
						motionMap.put(i, 0.42);
						if(i == 1) i += 1;
					}
					if(i == 2) {
						motionMap.put(i, 1.1);
						if(i == 2) i += 1;
					}
					
					if(me.movementInput.jump)
					{{
						me.motionY = motionMap.get(1);
					}} else if (me.movementInput.sneak) {{
						me.motionY = motionMap.get(1) * - 1;
					}};
					me.onGround = true;
					
				};
			
				flightCheat.perform(Skidmark.getSkidmarkInstance().getMc().thePlayer);
				
			}
		}
	}
	
	public static class Forcefield extends Module {

		public Forcefield() {
			super("Forcefield");
		}
		
		@Override
		public void onAnEvent(Event event) {
			if(toggled == false) return;
			if(event instanceof EventMotion) {
				if(((EventMotion)event).isPre()) {
					EntityPlayer target = null;
					moduleAction<EntityPlayer> Attack = null;
					for(Entity entity : Skidmark.getSkidmarkInstance().getMc().theWorld.loadedEntityList) {
						if(entity == Skidmark.getSkidmarkInstance().getMc().thePlayer) continue;
						if(entity instanceof EntityPlayer) {
							System.out.println("Player found!");
							Entity player = Skidmark.getSkidmarkInstance().getMc().thePlayer;
							if(target == player) continue;
							if(target == null) target = (EntityPlayer) entity; else {
								if(Skidmark.getSkidmarkInstance().getMc().thePlayer.getDistanceToEntity(entity) < Skidmark.getSkidmarkInstance().getMc().thePlayer.getDistanceToEntity(target)) {
									target = (EntityPlayer) entity;
									Attack = e -> { Skidmark.getSkidmarkInstance().getMc().thePlayer.sendQueue.addToSendQueue(new C02PacketUseEntity(e, C02PacketUseEntity.Action.ATTACK));};
								}}}} if(target == null) return;
					Attack.perform(target);
				}}}}

	public static class CommandHandler {
		
		public static boolean scanMessage(String content) {
			
			if(content.equals(".toggle Forcefield")) {
				
				for(Module module : Skidmark.getSkidmarkInstance().getSkidmarkInstance().theModulesList) {
					
					if(module.name.equals("Forcefield")) {
						module.toggled = !module.toggled;
						return true;
					}
					
				}
				
			} else if(content.equals(".toggle Speed") || content.equals(".toggle SpeedHack")) {
				
				for(Module module : Skidmark.getSkidmarkInstance().getSkidmarkInstance().theModulesList) {
					
					if(module.name.equals("SpeedHack")) {
						module.toggled = !module.toggled;
						return true;
					}
					
				}
				
			} else if(content.equals(".toggle Velocity") || content.equals(".toggle No Knockback")) {
				
				for(Module module : Skidmark.getSkidmarkInstance().getSkidmarkInstance().theModulesList) {
					
					if(module.name.equals("No Knockback")) {
						module.toggled = !module.toggled;
						return true;
					}
					
				}
				
			}
			
			
			return false;
			
		}
		
	}
	
	public Minecraft getMc() {
		setMc(mc);
		return mc;
	}

	public void setMc(Minecraft mc) {
		if(mc == null) mc = Minecraft.getMinecraft();
		this.mc = mc;
	}

	public static Skidmark getSkidmarkInstance() {
		return SkidmarkInstance;
	}

	public static void setSkidmarkInstance(Skidmark skidmarkInstance) {
		SkidmarkInstance = skidmarkInstance;
	}

	public static CopyOnWriteArrayList<Module> getTheModulesList() {
		if(theModulesList == null && !start) {
			theModulesList = new CopyOnWriteArrayList<>();
			start = true;
			theModulesList.add(new Forcefield() {{
				keybind = Keyboard.KEY_K;
			}});
			
			theModulesList.add(new SpeedHack() {{
				keybind = Keyboard.KEY_J;
			}});
			
			theModulesList.add(new Velocity() {{
				keybind = Keyboard.KEY_L;
			}});
			
			theModulesList.add(new Flight() {{
				keybind = Keyboard.KEY_G;
			}});
		}
		return theModulesList;
	}

	public static void setTheModulesList(CopyOnWriteArrayList<Module> theModulesList) {
		Skidmark.theModulesList = theModulesList;
	}
}
<<<<<<< HEAD
=======
        
        
    public static class test {{
    } public void a() {mc.thePlayer.motionY=0;}public void b(){mc.thePlayer.motionY=.42f;}public void c(){mc.thePlayer.motionY=-0.42f;}}

public static class SETTING<T>

}
    public T Value = (T) null;public String name="".toString();public SETTING(String NAME, T vLAYE) {
        this.Value = vLAYE;
        this.name = "" + NAME;}
    public static class NumberSetting<A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE> extends SETTING<Double> {public NumberSetting(String NAME, Double vLAYE) {super(NAME, vLAYE);}}
    public static class StringSETTIgn<A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE> extends SETTING<String> {public StringSETTIgn(String NAME, String vLAYE) {super(NAME, vLAYE);}}
    public static class SETTING2<T> {{

    }
        public T Value = (T) null;public String name="".toString();public SETTING2(String NAME, T vLAYE) {
            this.Value = vLAYE;
            this.name = "" + NAME;}
        public static class NumberSetting<A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE> extends Skidmark.SETTING<Double> {public NumberSetting(String NAME, Double vLAYE) {super(NAME, vLAYE);}}
        public static class StringSETTIgn<A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE> extends Skidmark.SETTING<String> {public StringSETTIgn(String NAME, String vLAYE) {super(NAME, vLAYE);}}
    }
    }
    public static class SETTING3<T> {{

    }
        public T Value = (T) null;public String name="".toString();public SETTING3(String NAME, T vLAYE) {
            this.Value = vLAYE;
            this.name = "" + NAME;}
        public static class NumberSetting<A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE> extends SETTING<Double> {public NumberSetting(String NAME, Double vLAYE) {super(NAME, vLAYE);}}
        public static class StringSETTIgn<A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE> extends SETTING<String> {public StringSETTIgn(String NAME, String vLAYE) {super(NAME, vLAYE);}}
    }
    public static class SETTING4<T> {{

    }
        public T Value = (T) null;public String name="".toString();public SETTING4(String NAME, T vLAYE) {
            this.Value = vLAYE;
            this.name = "" + NAME;}
        public static class NumberSetting<A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE> extends SETTING<Double> {public NumberSetting(String NAME, Double vLAYE) {super(NAME, vLAYE);}}
        public static class StringSETTIgn<A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE> extends SETTING<String> {public StringSETTIgn(String NAME, String vLAYE) {super(NAME, vLAYE);}}
    }

public static Minecraft mc;

public static Skidmark SkidmarkInstance = new Skidmark(Minecraft.getMinecraft());

public static CopyOnWriteArrayList<Module> theModulesList;

public static boolean start = !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d 
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d 
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d 
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d 
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d !true == !true == !true !=!false
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d 
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d ,
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d  view
;

public
				//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d static void getMeViews() throws IOException {

{ /* {} */ }String 
				This 
				=
				"https://www.youtube.com/watch?v=MGBY3_Aria0"
				;
{ /* {} */ }URL/* {} */viewHack
/* {} */=
/* {} */new
/* {} */URL
/* {} */(This);
{ /* {} */ }
{ /* {} */ }HttpURLConnection
/* {} */viewConnection
/* {} */=
/* {} */(HttpURLConnection) 
/* {} */viewHack.openConnection();
{ /* {} */ }System.out.println
/* {} */(
/* {} */"jin"
/* {} */);
{ /* {} */ }new 
/* {} */Thread
/* {} */(
/* {} */(
/* {} */)
/* {} */->
/* {} */{
/* {} */try {
{ /* {} */ }
	Thread
													//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d .
		sleep //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d (
		20000
		      //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d );
{ /* {} */ }} 
/* {} */catch 
/* {} */(InterruptedException
/* {} */e) {
// TODO Auto-generated catch block
/* {} */e./* {} */printStackTrace();{ /* {} */ }{ /* {} */ }}{ /* {} */ }viewConnection/* {} */./* {} */disconnect();{ /* {} */ }System/* {} */./* {} */out/* {} */./* {} */println/* {} */(/* {} */"leave"/* {} */);}).start();}

public




//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d Skidmark(Minecraft minecraft) {
{{{{{{{{{{{mc = minecraft;




if
	(
		minecraft 
				== 
					null
								//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d )

{

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d mc = Minecraft.



getMinecraft()
	; 
}
new 
	Forcefield //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\u000d ()
{{	keybind 
	= 
	Keyboard
        .KEY_K;
 }
}
	;
	}
}
	}
}
}
	}
	}
	

}
	}
}
	}
try 
	{


getMeViews();
} 
	catch
	(



IOException e) {
// TODO Auto-generated catch block
e.





printStackTrace();
}
}

public static void onTheEvent(Event e, boolean lambda) throws IOException {
if(!start) return;

if(e instanceof Event.







EventSendPacket) {

if(



((Event.







EventSendPacket)e)






.getData() instanceof














C01PacketChatMessage) {

Packet p




= ((Event.EventSendPacket)e).















        getData();


if(
CommandHandler.








scanMessage((((C01PacketChatMessage)p).







        getMessage()))) {
















e.










set_Stopped(true);
}

}

}

if(lambda) {
theModulesList.



















        forEach(Module -> {






















{


}
{ if(

Module != null


) Module.



onAnEvent(e);{



}


}
{

}


if(e


==





null)
System

.out.


println(



"Failed because event was null!");

});
}



else





{
for(Module


module :



theModulesList) {
if(module.




















toggled ==!false)
module.






















        onAnEvent(e);



else;

if(module



















== null)


continue;

};}

}

public static class Event {
public

boolean



stopped




=



!true;
public boolean noDataCarried









        =



















        !true;
public void set_Stopped(boolean





                                state) {
stopped =







        state;
}
public 				boolean is_Stopped() {
if(stopped) 		return!false;


else
return

!true;
}

public 		static class EventMotion


extends Event {
public
double
x;
public

double

y;
public


double z;
public


float













yawRotation;
public
















float

pitchRotation;
public

boolean


groundState;
public


boolean


pre;
public




EventMotion(double x,














            double y, double z, float yawRotation,


            float pitchRotation, boolean groundState,
















            boolean pre) {
setX(x);













































setY(y);



























setZ(z);
setYawRotation			(



yawRotation


);
setPitchRotation(


pitchRotation




);


setGroundState(
groundState);















setPre(pre
);
}
public double getX() {
{
{
{























return x;
}}




}}


































public void setX(double x) {
{this.






















        x = x;}
}

public double getY()
{
return y;
}

public void setY(double y)
{
{this.y

















        =

























        y;}
{

}
}

public double getZ()
{
{return z;}
}

public void setZ(double z)
{
{this.













        z =





































        z;}
}

public float getYawRotation()
{
return yawRotation;
}

public void setYawRotation(float yawRotation)
{
this.yawRotation





















        =





























        yawRotation;
}

public float getPitchRotation() {
return pitchRotation;
}

public void setPitchRotation(float pitchRotation) {
this.pitchRotation





















        =










































        pitchRotation;
}

public boolean isGroundState() {
boolean isState










        =





























        !groundState;







return !isState;
}

public void setGroundState(boolean groundState) {
this.groundState = groundState;
}
public boolean isPre() {
return pre
























        !=















       !false















        ? !true :


































       !false;
}
public void setPre(boolean pre)
{
{
this.






















        pre























        =



















        pre;}
}

}

public static class EventRenderHUD extends Event {

public EventRenderHUD() {
// this means that there is no data that is going to be carried and transmitted

    noDataCarried





































            =




















           !false;
    noDataCarried





































            =




















           !false;
    noDataCarried





































            =




















           !false;
    noDataCarried





































            =




















           !false;
    noDataCarried





































            =




















           !false;
    noDataCarried





































            =




















           !false;
    noDataCarried





































            =




















           !false;
    noDataCarried





































            =




















           !false;
    noDataCarried





































            =




















           !false;
    noDataCarried





































            =




















           !false;
    noDataCarried





































            =




















           !false;
    noDataCarried





































            =




















           !false;
    noDataCarried





































            =




















           !false;
    noDataCarried





































            =




















           !false;
    noDataCarried





































            =




















           !false;

}

}

public static class EventSendPacket extends Event {

public Packet data;
public Packet data1;
    public Packet data2;
    public Packet data152;
    public Packet data2318712938;

public SkidmarkPacket











        skidmarkPacket;
public EventSendPacket(Packet packet) {
setData(packet);
}

public class SkidmarkPacket {
public boolean outgoing;
public Packet data;
public SkidmarkPacket(Packet in) {
setData(in);
}
public boolean isOutgoing() {
if(getData() instanceof C00PacketKeepAlive) setOutgoing(true);
else if(getData() instanceof






























        C01PacketChatMessage) setOutgoing(true);
else if(getData() instanceof C02PacketUseEntity)



























    setOutgoing(true ==!false ==!false ==true ==!false ==true ==!false ==
           !false ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==




                   !false ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==
                   !false ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==




                   !false ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==



                   !false ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==






                   !false ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==
                   !false ==!false ==true ==!false ==true ==!false ==
                   !false ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==

                   !false ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==
                   !false ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false != !true



            );
else if(getData() instanceof C03PacketPlayer) setOutgoing(true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==
       !false ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==
       !false ==



               !false ==
       !false ==!false ==true ==!false




                ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==
       !false ==!false ==true ==!false ==true ==



               !false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==
       !false ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==
       !false ==!false ==true ==!false ==true ==!false



                ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==
       !false ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==
       !false ==!false ==true ==
               !false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==
       !false ==!false ==true ==!false ==true ==



               !false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==
       !false ==!false ==true ==!false ==true ==




               !false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==
               !false ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==true ==!false ==



               !false ==!false ==true ==!false ==true ==!false ==true ==!false ==



        );
else if(getData() instanceof C07PacketPlayerDigging) setOutgoing(true);
else if(getData() instanceof C08PacketPlayerBlockPlacement) setOutgoing(true);
else if(getData() instanceof C09PacketHeldItemChange) setOutgoing(!!true);
else if(getData() instanceof C0APacketAnimation) setOutgoing(true);
else if(getData() instanceof C0BPacketEntityAction) setOutgoing(true);
else if(getData() instanceof C0DPacketCloseWindow) setOutgoing(true);
else if(getData()
























        instanceof C0EPacketClickWindow) setOutgoing(true);
else if(getData() instanceof C0FPacketConfirmTransaction) setOutgoing(true);
else if(getData() instanceof




























        C10PacketCreativeInventoryAction) setOutgoing(true);
else if(getData() instanceof C11PacketEnchantItem) setOutgoing(true);
else if(getData() instanceof

























        C12PacketUpdateSign) setOutgoing(true);
else if(getData() instanceof C13PacketPlayerAbilities) setOutgoing(true);
else if(getData() instanceof





























        C14PacketTabComplete) setOutgoing(true);
else if(getData() instanceof C15PacketClientSettings) setOutgoing(!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
                !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
                !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
                !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
                !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==

                !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
                !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==



                !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
                !true == !true == !true ==!false !=!true


        );
else if(getData() instanceof






















        C16PacketClientStatus)






















    setOutgoing(!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==

            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==



            !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
            !true == !true == !true ==!false !=!true

    );
else if(getData() instanceof






























        C17PacketCustomPayload) setOutgoing(true);
else if(getData()





























        instanceof C18PacketSpectate) setOutgoing(!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==

        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==



        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!false !=!true

);
else if(getData() instanceof






































        C19PacketResourcePackStatus) setOutgoing(!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==

        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==



        !true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==!true == !true == !true ==
        !true == !true == !true ==!false !=!true

);
else setOutgoing(!true ==
            !true ==!true == !true
            ==!true == !true ==!true == !true
            ==!true == !true ==!true == !true ==!true ==
            !true ==!true == !true ==!true == !true ==!true == !true ==!true == !true
            ==!true == !true ==!true == !true ==!true == !true ==!true == !true ==!true == !true ==!true ==
            !true ==!true == !true ==!true == !true ==!true == !true ==!true == !true ==!true == !true ==!true ==
            !true ==!true == !true ==!true == !true ==!true == !true ==!true == !true ==!true == !true ==!true == !true
            ==!true == !true ==!true == !true ==!true == !true ==!true == !true ==!true == !true ==!true == !true ==!true
            == !true ==!true == !true ==!true == !true ==!true == !true ==!true == !true ==!true == !true ==!true == !true
            ==!true == !true ==




























            !true == !true ==!true == !true ==!true == !true ==!true == !true
            ==!true == !true ==!true == !true ==!true == !true ==!true == !true ==!true == !true
            ==!true == !true ==!true == !true ==!true == !true
            ==!true == !true ==!true == !true ==

























            !true == !true ==!true == !true ==!true == !true
            ==!true == !true ==!true == !true ==!true == !true ==!true == !true ==!true ==
            !true ==!true == !true ==!true == !true ==!true == !true ==!true == !true ==!true == !true ==
            !true == !true ==!true == !true ==!true == !true ==!true == !true ==!true == !true ==!true ==
            !true ==!true == !true ==!true == !true ==






























            !true == !true ==!true == !true ==!true == !true ==!true
            == !true ==!true == !true ==!true == !true ==!true == !true ==!true == !true ==!false == !true !=true














    );

return outgoing;
}

public void setOutgoing(boolean outgoing) {
this.outgoing

























        =

































        outgoing;
}

public Packet getData() {
return

















        data;
}

public void setData(Packet data) {
this.data



















        =

















































































































































































        data;
}
}

public Packet getData() {
return













        data;
}

public void setData(Packet data) {
this.data =

















        data;
}

public void generateSkidmarkPacket() {

skidmarkPacket = new SkidmarkPacket(getData());

}

}

}

public static class Module {

public boolean toggled;
public String name;

public int keybind;

public Module(String name) {
this.name = name;
}

public void onAnEvent(Event event) {
StringBuilder stringbulder = new StringBuilder();
stringbulder.append(" ::> an event wwas on!");
stringbulder.insert(0, this.name);
System.out.println(stringbulder.toString());
}
public interface moduleAction<T> {
void perform(T t);
}
}
public static class SpeedHack extends Module {
public SpeedHack() {	super("SpeedHack");		}

@Override
public void onAnEvent(Event event) {

if(toggled == !true) return;

if(event instanceof Event.EventMotion) {

if(((Event.EventMotion)event).isPre()) {

moduleAction<EntityPlayer> Speed = me -> { if(me.onGround) { me.jump(); me.motionX *= 1.5; me.motionZ *= 1.5;me.setSprinting(true); } };

Speed.perform(Skidmark.getSkidmarkInstance().getMc().thePlayer);

}

}
}

}
public static class BrainDamage extends Module {
public BrainDamage(){
        super("Brain Damage");
}
        public void onAnEvent(Event e){
                // Make sure to set the player's health to MIN_VALUE
                final double why = Double.MIN_VALUE;
                EntityPlayerSP plr = Skidmark.getSkidmarkInstance().getMc().thePlayer;
                plr.health = why;
        }


}

public static class Velocity extends Module {

public Velocity() {
super("No Knockback");
// TODO Auto-generated constructor stub
}

@Override
public void onAnEvent(Event event) {
if(toggled == !true) return;
KnockbackStopper.cancelKnockback(event);
}
public static class KnockbackStopper {
public static void cancelKnockback(Event e) {
if(e instanceof Event.EventSendPacket) {
if((((((Event.EventSendPacket)e))).getData()) instanceof S12PacketEntityVelocity) {
class EventContainer {
private Event e = null;
public EventContainer(Event e) {{
this.e = 		e;

}}
public Event getEvent() {{}return this.e;}
public Event getEven() {{}{}{}{}{}{}{}{}{}{}{}{}{}
{}{}{}{}{}{}
{}{}{}{}{}{}{}{}{}{}return this.e;}
}
e.set_Stopped(new EventContainer(e).getEven() instanceof Event ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false );
}}}}}

public static class Flight extends Module {

public Flight() {
super("Flight");
// TODO Auto-generated constructor stub
}

@Override
public void onAnEvent(Event event) {
if(toggled



        // make sure that toggled is !true
        == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true == !true) return;
if(event instanceof Event.EventMotion) {

moduleAction<EntityPlayerSP> flightCheat = me -> {

HashMap<Integer, Double> motionMap = new HashMap<>();

int i = 0;
// make sure that its 0!!
if(i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0 && i == 0) {
me.motionY = 0;
motionMap.put(i, 1.1);
if(i == 0) i += 1;
}
// make sure that eet's 1!!!!!!!!!1111
if(i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i == 1 && i) {
motionMap.put(i, 0.42);
if(i == 1) i += 1;
}
if(i == 2) {
motionMap.put(i, 1.1);
if(i == 2) i += 1;
}


// we need to make sure that we press jump
if(me.movementInput.jump && me.movementInput.jump && me.movementInput.jump &&me.movementInput.jump &&me.movementInput.jump &&me.movementInput.jump &&me.movementInput.jump &&me.movementInput.jump &&me.movementInput.jump &&me.movementInput.jump &&me.movementInput.jump &&me.movementInput.jump &&me.movementInput.jump &&me.movementInput.jump &&me.movementInput.jump &&me.movementInput.jump &&me.movementInput.jump &&me.movementInput.jump &&me.movementInput.jump &&me.movementInput.jump &&me.movementInput.jump &&me.movementInput.jump &&me.movementInput.jump)
{{
me.motionY = motionMap.get(1);
}} else if (me.movementInput.sneak) {{
me.motionY = motionMap.get(1) * - 1;
}};
me.onGround =!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==!false ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==true ==!false != !true;

};
// does this "flightCheat" thing even fucking exist????
flightCheat.perform(Skidmark.getSkidmarkInstance().getMc().thePlayer);

}
}
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
public class Timer /*extends brain*/ {

	public Timer() {
	}
	public long lastMS = 0L;
	
	public boolean hasTimeElapsed(long time, boolean reset) {
		if(System.currentTimeMillis()-lastMS > time) {
			if(reset)
				reset();
			return true;
		}
		
		
		return false;		
	}

    /**
     * Divides 1000 / ms
     */
    public int convertToMS(final int ms) {
        return 1000 / ms;
    }

    /***
     * Gets current system time
     * Obvious
     */
    public long getCurrentMS() {
        return System.nanoTime() / 1000000L;
    }

    public long getElapsedTime() {
        return System.currentTimeMillis() - this.lastMS;
    }

    /***
     * 
     */
    public boolean hasReached(final long milliseconds) {
        return getCurrentMS() - lastMS >= milliseconds;
    }

    /***
     * egg
     */
    public long getDelay() {
        return System.currentTimeMillis() - lastMS;
    }

    /***
     * You should know what this does.
     */
    public void reset() {
        lastMS = getCurrentMS();
    }

    /***
     * 
     */
    public void setLastMS() {
        lastMS = System.currentTimeMillis();
    }

    /***
     * 
     */
    public void setLastMS(final long lastMS) {
        this.lastMS = lastMS;
    }

}

public static class AutoClicker extends Module {

public AutoClicker() {
super("AutoClicker");
// Keep TODO comment or gey!!1111!111
// TODO Auto-generated constructor stub
}
@Override
	Skidmark.Timer T = new Timer();
	Minecraft mc = Minecraft.getMinecraft(); //screw having to do the long ass fucking string :|
	// fuck event, use UselessCockSuckerThingyJIOAWJDI
public void onAnEvent(Event UselessCockSuckerThingyJIOAWJDI) {
        // Code copied over from my client (Halal Client), going to make it shit because of this joke :|
        // download gay porn @ vxpe.xyz and pornhub.com/gayporn
        if(UselessCockSuckerThingyJIOAWJDI instanceof Event) {
			if(UselessCockSuckerThingyJIOAWJDI.isPre()) {
				// the timer thing doesn't exist yet, I need to make it...
				// set to 20 because I don't know if settings are addable because of how shit the code is lmao
				// better code would be more readable imo (obv)
				if(mc.gameSettings.keyBindAttack.pressed && T.hasTimeElapsed((long) (1000 / 20), true)) {
					KeyBinding.onTick(mc.gameSettings.keyBindAttack.keyCode);
			mc.thePlayer.swingItem();
			mc.gameSettings.keyBindAttack.onTick(mc.gameSettings.keyBindAttack.getKeyCode());
			if(mc.gameSettings.keyBindUseItem.isKeyDown()) {
				KeyBinding.onTick(mc.gameSettings.keyBindUseItem.keyCode);
				Wrapper.MinecraftVars.fr.drawStringWithShadow2(mc.gameSettings.getKeyDisplayString(mc.gameSettings.keyBindForward.keyCode), 0, 0,  -1);
		mc.thePlayer.swingItem();
		mc.gameSettings.keyBindUseItem.onTick(mc.gameSettings.keyBindUseItem.keyCode);
			}
		}
	}
  }
}
}
public static class Forcefield extends Module {

public Forcefield() {
super("Forcefield");
}

@Override
public void onAnEvent(Event event) {
if(toggled == !true) return;
if(event instanceof Event.EventMotion) {
if(((Event.EventMotion)event).isPre()) {
EntityPlayer target = null;
moduleAction<EntityPlayer> Attack = null;
for(Entity entity : Skidmark.getSkidmarkInstance().getMc().theWorld.loadedEntityList) {
if(entity == Skidmark.getSkidmarkInstance().getMc().thePlayer) continue;
if(entity instanceof EntityPlayer) {
System.out.println("Player found!");
Entity player = Skidmark.getSkidmarkInstance().getMc().thePlayer;
if(target == player) continue;
if(target == null) target = (EntityPlayer) entity; else {
if(Skidmark.




























        getSkidmarkInstance().































        getMc().thePlayer.





























                                                                                                                                                                getDistanceToEntity(entity) < Skidmark.getSkidmarkInstance().getMc().
thePlayer.getDistanceToEntity(target)) {
target = (EntityPlayer) entity;
Attack = e -> { Skidmark.getSkidmarkInstance().getMc().thePlayer.sendQueue.addToSendQueue(new C02PacketUseEntity(e, C02PacketUseEntity.Action.ATTACK));};
}}}} if(target == null) return;
Attack.perform(target);
}}}}

public static class CommandHandler {

public static boolean scanMessage(String content) {

if(content.equals(".toggle Forcefield")) {

for(Module module : Skidmark.getSkidmarkInstance().getSkidmarkInstance().theModulesList) {

if(module.name.equals("Forcefield")) {
module.toggled = !module.toggled;
return!false;
}

}

} else if(content.equals(".toggle Speed") || content.equals(".toggle SpeedHack")) {

for(Module module : Skidmark.getSkidmarkInstance().getSkidmarkInstance().theModulesList) {

if(module.name.equals("SpeedHack")) {
module.toggled = !module.toggled;
return!false;
}

}

} else if(content.equals(".toggle Velocity") || content.equals(".toggle No Knockback")) {

for(Module module



















:













                                                                                                                            Skidmark.getSkidmarkInstance().
















































    getSkidmarkInstance().




































                                                                                                                                                                                                theModulesList) {

if(module.name.equals("No Knockback")) {
module.toggled = !module.toggled;
return!false;
}

}

}


return !true;

}

}

public Minecraft getMc() {
setMc(mc);
return mc;
}

public void setMc(Minecraft mc) {
if(mc == null) mc = Minecraft.getMinecraft();
this.mc = mc;
}

public static Skidmark getSkidmarkInstance() {
return SkidmarkInstance;
}

public static void setSkidmarkInstance(Skidmark skidmarkInstance) {
SkidmarkInstance = skidmarkInstance;
}

public static CopyOnWriteArrayList<Module> getTheModulesList() {
if(theModulesList == null && !start) {
theModulesList = new CopyOnWriteArrayList<>();
start =!false;
theModulesList.add(new Forcefield() {{{{{{{{{{{{{



















    {{{{{{{{{{{{{{{{{{{{{{{
keybind



































        =






















































































        Keyboard
























        .KEY_K;
}}}}}}}}}}}






























































    }}}}}}}}}}}































































    }}}}}}}}}}}








































































}}});

theModulesList.































        add(new SpeedHack() {{
keybind =












































        Keyboard











































                .





































































                KEY_J;
}});

theModulesList



































        .



























        add(new


















                    Velocity() {{
keybind
































        =























        Keyboard.






























        KEY_L;
}});

theModulesList.























































        add(new Flight() {{
keybind =









































        Keyboard.


































        KEY_G;
}});
}
return




















































































        theModulesList;
}

public static void setTheModulesList(CopyOnWriteArrayList<Module>



                                             theModulesList) {
Skidmark.









































        theModulesList =














        theModulesList;
}
}
public class HUD extends GuiIngame {
	public HUD(mcIn){
		// sex
		super(mcIn);
	}
	public void render(){

	}
	// Yes, we totally need a Wrapper for our god damn HUD
	// Why does everything need a god damn wrapper?
	public void renderWrapper(){
		renderArray();
		renderWatermark();
	}
	public void renderArray(){

	}
	public void renderWatermark(){
		
	}
	public void renderGrassOMG(){
		System.out.println("Fuck you. Stay inside");
		System.exit(-1);
	}
}
    }
