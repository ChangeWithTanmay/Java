import OpenAI from "openai";

const client = new OpenAI({
  apiKey: "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", // or paste key directly
});

async function chat() {
  const response = await client.responses.create({
    model: "gpt-4.1-mini",
    input: [
      {
        role: "user",
        content: "Who are you?"
      },
      {
        role: "user",
        content: "Explain Node.js in simple words"
      }
    ]
  });

  console.log(response.output_text);
}

chat();
