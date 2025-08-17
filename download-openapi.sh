#!/bin/bash

# This script downloads the LangSmith OpenAPI specification file.

# The URL of the file to download
URL="https://api.smith.langchain.com/openapi.json"

# The desired name for the output file
OUTPUT_FILE="api/openapi.json"

echo "Starting download from: $URL"

# Use curl to download the file.
# -L: Follows any redirects.
# -o: Specifies the output filename.
# --fail: Makes curl fail silently on server errors (no output, just an error code).
curl -L --fail -o "$OUTPUT_FILE" "$URL"

# Check the exit code of the curl command to see if it succeeded.
if [ $? -eq 0 ]; then
  echo "✅ Download complete! File saved as '$OUTPUT_FILE'."
else
  echo "❌ Download failed. Please check the URL and your internet connection."
  exit 1
fi