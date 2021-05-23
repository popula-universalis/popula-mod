import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Constants.MOD_ID)
public class Popula {
	public static final Logger LOGGER = LogManager.getLogger(Constants.MOD_NAME);

	public static Popula instance;
	public Popula(){
		instance = this;
	}
}
