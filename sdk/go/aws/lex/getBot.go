// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package lex

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about a specific Amazon Lex Bot.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/lex"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := fmt.Sprintf("%v%v", "$", "LATEST")
// 		_, err := lex.LookupBot(ctx, &lex.LookupBotArgs{
// 			Name:    "OrderFlowers",
// 			Version: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupBot(ctx *pulumi.Context, args *LookupBotArgs, opts ...pulumi.InvokeOption) (*LookupBotResult, error) {
	var rv LookupBotResult
	err := ctx.Invoke("aws:lex/getBot:getBot", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBot.
type LookupBotArgs struct {
	// The name of the bot. The name is case sensitive.
	Name string `pulumi:"name"`
	// The version or alias of the bot.
	Version *string `pulumi:"version"`
}

// A collection of values returned by getBot.
type LookupBotResult struct {
	// The ARN of the bot.
	Arn string `pulumi:"arn"`
	// Checksum of the bot used to identify a specific revision of the bot's `$LATEST` version.
	Checksum string `pulumi:"checksum"`
	// Specifies if this Amazon Lex Bot is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA.
	ChildDirected bool `pulumi:"childDirected"`
	// The date that the bot was created.
	CreatedDate string `pulumi:"createdDate"`
	// A description of the bot.
	Description string `pulumi:"description"`
	// When set to true user utterances are sent to Amazon Comprehend for sentiment analysis.
	DetectSentiment bool `pulumi:"detectSentiment"`
	// Set to true if natural language understanding improvements are enabled.
	EnableModelImprovements bool `pulumi:"enableModelImprovements"`
	// If the `status` is `FAILED`, the reason why the bot failed to build.
	FailureReason string `pulumi:"failureReason"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The maximum time in seconds that Amazon Lex retains the data gathered in a conversation.
	IdleSessionTtlInSeconds int `pulumi:"idleSessionTtlInSeconds"`
	// The date that the bot was updated.
	LastUpdatedDate string `pulumi:"lastUpdatedDate"`
	// Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the bot.
	Locale string `pulumi:"locale"`
	// The name of the bot, case sensitive.
	Name string `pulumi:"name"`
	// The threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents in a PostContent or PostText response. AMAZON.FallbackIntent and AMAZON.KendraSearchIntent are only inserted if they are configured for the bot.
	NluIntentConfidenceThreshold float64 `pulumi:"nluIntentConfidenceThreshold"`
	// The status of the bot.
	Status string `pulumi:"status"`
	// The version of the bot. For a new bot, the version is always `$LATEST`.
	Version *string `pulumi:"version"`
	// The Amazon Polly voice ID that the Amazon Lex Bot uses for voice interactions with the user.
	VoiceId string `pulumi:"voiceId"`
}
