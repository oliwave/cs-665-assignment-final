package edu.bu.met.cs665.mode;

import edu.bu.met.cs665.path.Path;

public interface Mode {

  boolean validatePath(Path gamePath, Path userPath);

}
