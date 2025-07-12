void main(String[] args) {
        if (true) {
        // if (args.length != 0) {
            String argExtension = detectByExtension(args[0]);

            switch (argExtension) {
                // Filetype for character file
                case "chr":
                    characterEditor(args[0]);
                    break;
                // Filetype for resource file
                case "arc":
                    resourceEditor(args[0]);
                    break;
                // Filetype for database file
                case "arz":
                    databaseEditor(args[0]);
                    break;
            }
        }
    }

public void databaseEditor(String filepath) {

}

public void resourceEditor(String filepath) {
}

public void characterEditor(String filepath) {

}


public String detectByExtension(String filename) {
    int dotIndex = filename.lastIndexOf('.');
    if (dotIndex > 0) {
        return filename.substring(dotIndex + 1).toLowerCase();
    }
    return "undefined";
}
