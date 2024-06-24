# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['BucketNotificationArgs', 'BucketNotification']

@pulumi.input_type
class BucketNotificationArgs:
    def __init__(__self__, *,
                 bucket: pulumi.Input[str],
                 eventbridge: Optional[pulumi.Input[bool]] = None,
                 lambda_functions: Optional[pulumi.Input[Sequence[pulumi.Input['BucketNotificationLambdaFunctionArgs']]]] = None,
                 queues: Optional[pulumi.Input[Sequence[pulumi.Input['BucketNotificationQueueArgs']]]] = None,
                 topics: Optional[pulumi.Input[Sequence[pulumi.Input['BucketNotificationTopicArgs']]]] = None):
        """
        The set of arguments for constructing a BucketNotification resource.
        :param pulumi.Input[str] bucket: Name of the bucket for notification configuration.
               
               The following arguments are optional:
        :param pulumi.Input[bool] eventbridge: Whether to enable Amazon EventBridge notifications. Defaults to `false`.
        :param pulumi.Input[Sequence[pulumi.Input['BucketNotificationLambdaFunctionArgs']]] lambda_functions: Used to configure notifications to a Lambda Function. See below.
        :param pulumi.Input[Sequence[pulumi.Input['BucketNotificationQueueArgs']]] queues: Notification configuration to SQS Queue. See below.
        :param pulumi.Input[Sequence[pulumi.Input['BucketNotificationTopicArgs']]] topics: Notification configuration to SNS Topic. See below.
        """
        pulumi.set(__self__, "bucket", bucket)
        if eventbridge is not None:
            pulumi.set(__self__, "eventbridge", eventbridge)
        if lambda_functions is not None:
            pulumi.set(__self__, "lambda_functions", lambda_functions)
        if queues is not None:
            pulumi.set(__self__, "queues", queues)
        if topics is not None:
            pulumi.set(__self__, "topics", topics)

    @property
    @pulumi.getter
    def bucket(self) -> pulumi.Input[str]:
        """
        Name of the bucket for notification configuration.

        The following arguments are optional:
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: pulumi.Input[str]):
        pulumi.set(self, "bucket", value)

    @property
    @pulumi.getter
    def eventbridge(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to enable Amazon EventBridge notifications. Defaults to `false`.
        """
        return pulumi.get(self, "eventbridge")

    @eventbridge.setter
    def eventbridge(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "eventbridge", value)

    @property
    @pulumi.getter(name="lambdaFunctions")
    def lambda_functions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BucketNotificationLambdaFunctionArgs']]]]:
        """
        Used to configure notifications to a Lambda Function. See below.
        """
        return pulumi.get(self, "lambda_functions")

    @lambda_functions.setter
    def lambda_functions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BucketNotificationLambdaFunctionArgs']]]]):
        pulumi.set(self, "lambda_functions", value)

    @property
    @pulumi.getter
    def queues(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BucketNotificationQueueArgs']]]]:
        """
        Notification configuration to SQS Queue. See below.
        """
        return pulumi.get(self, "queues")

    @queues.setter
    def queues(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BucketNotificationQueueArgs']]]]):
        pulumi.set(self, "queues", value)

    @property
    @pulumi.getter
    def topics(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BucketNotificationTopicArgs']]]]:
        """
        Notification configuration to SNS Topic. See below.
        """
        return pulumi.get(self, "topics")

    @topics.setter
    def topics(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BucketNotificationTopicArgs']]]]):
        pulumi.set(self, "topics", value)


@pulumi.input_type
class _BucketNotificationState:
    def __init__(__self__, *,
                 bucket: Optional[pulumi.Input[str]] = None,
                 eventbridge: Optional[pulumi.Input[bool]] = None,
                 lambda_functions: Optional[pulumi.Input[Sequence[pulumi.Input['BucketNotificationLambdaFunctionArgs']]]] = None,
                 queues: Optional[pulumi.Input[Sequence[pulumi.Input['BucketNotificationQueueArgs']]]] = None,
                 topics: Optional[pulumi.Input[Sequence[pulumi.Input['BucketNotificationTopicArgs']]]] = None):
        """
        Input properties used for looking up and filtering BucketNotification resources.
        :param pulumi.Input[str] bucket: Name of the bucket for notification configuration.
               
               The following arguments are optional:
        :param pulumi.Input[bool] eventbridge: Whether to enable Amazon EventBridge notifications. Defaults to `false`.
        :param pulumi.Input[Sequence[pulumi.Input['BucketNotificationLambdaFunctionArgs']]] lambda_functions: Used to configure notifications to a Lambda Function. See below.
        :param pulumi.Input[Sequence[pulumi.Input['BucketNotificationQueueArgs']]] queues: Notification configuration to SQS Queue. See below.
        :param pulumi.Input[Sequence[pulumi.Input['BucketNotificationTopicArgs']]] topics: Notification configuration to SNS Topic. See below.
        """
        if bucket is not None:
            pulumi.set(__self__, "bucket", bucket)
        if eventbridge is not None:
            pulumi.set(__self__, "eventbridge", eventbridge)
        if lambda_functions is not None:
            pulumi.set(__self__, "lambda_functions", lambda_functions)
        if queues is not None:
            pulumi.set(__self__, "queues", queues)
        if topics is not None:
            pulumi.set(__self__, "topics", topics)

    @property
    @pulumi.getter
    def bucket(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the bucket for notification configuration.

        The following arguments are optional:
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bucket", value)

    @property
    @pulumi.getter
    def eventbridge(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to enable Amazon EventBridge notifications. Defaults to `false`.
        """
        return pulumi.get(self, "eventbridge")

    @eventbridge.setter
    def eventbridge(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "eventbridge", value)

    @property
    @pulumi.getter(name="lambdaFunctions")
    def lambda_functions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BucketNotificationLambdaFunctionArgs']]]]:
        """
        Used to configure notifications to a Lambda Function. See below.
        """
        return pulumi.get(self, "lambda_functions")

    @lambda_functions.setter
    def lambda_functions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BucketNotificationLambdaFunctionArgs']]]]):
        pulumi.set(self, "lambda_functions", value)

    @property
    @pulumi.getter
    def queues(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BucketNotificationQueueArgs']]]]:
        """
        Notification configuration to SQS Queue. See below.
        """
        return pulumi.get(self, "queues")

    @queues.setter
    def queues(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BucketNotificationQueueArgs']]]]):
        pulumi.set(self, "queues", value)

    @property
    @pulumi.getter
    def topics(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BucketNotificationTopicArgs']]]]:
        """
        Notification configuration to SNS Topic. See below.
        """
        return pulumi.get(self, "topics")

    @topics.setter
    def topics(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BucketNotificationTopicArgs']]]]):
        pulumi.set(self, "topics", value)


class BucketNotification(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 eventbridge: Optional[pulumi.Input[bool]] = None,
                 lambda_functions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BucketNotificationLambdaFunctionArgs']]]]] = None,
                 queues: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BucketNotificationQueueArgs']]]]] = None,
                 topics: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BucketNotificationTopicArgs']]]]] = None,
                 __props__=None):
        """
        Manages a S3 Bucket Notification Configuration. For additional information, see the [Configuring S3 Event Notifications section in the Amazon S3 Developer Guide](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html).

        > **NOTE:** S3 Buckets only support a single notification configuration. Declaring multiple `s3.BucketNotification` resources to the same S3 Bucket will cause a perpetual difference in configuration. See the example "Trigger multiple Lambda functions" for an option.

        > This resource cannot be used with S3 directory buckets.

        ## Example Usage

        ### Add notification configuration to SNS Topic

        ```python
        import pulumi
        import pulumi_aws as aws

        bucket = aws.s3.BucketV2("bucket", bucket="your-bucket-name")
        topic = aws.iam.get_policy_document_output(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="Service",
                identifiers=["s3.amazonaws.com"],
            )],
            actions=["SNS:Publish"],
            resources=["arn:aws:sns:*:*:s3-event-notification-topic"],
            conditions=[aws.iam.GetPolicyDocumentStatementConditionArgs(
                test="ArnLike",
                variable="aws:SourceArn",
                values=[bucket.arn],
            )],
        )])
        topic_topic = aws.sns.Topic("topic",
            name="s3-event-notification-topic",
            policy=topic.json)
        bucket_notification = aws.s3.BucketNotification("bucket_notification",
            bucket=bucket.id,
            topics=[aws.s3.BucketNotificationTopicArgs(
                topic_arn=topic_topic.arn,
                events=["s3:ObjectCreated:*"],
                filter_suffix=".log",
            )])
        ```

        ### Add notification configuration to SQS Queue

        ```python
        import pulumi
        import pulumi_aws as aws

        bucket = aws.s3.BucketV2("bucket", bucket="your-bucket-name")
        queue = aws.iam.get_policy_document_output(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="*",
                identifiers=["*"],
            )],
            actions=["sqs:SendMessage"],
            resources=["arn:aws:sqs:*:*:s3-event-notification-queue"],
            conditions=[aws.iam.GetPolicyDocumentStatementConditionArgs(
                test="ArnEquals",
                variable="aws:SourceArn",
                values=[bucket.arn],
            )],
        )])
        queue_queue = aws.sqs.Queue("queue",
            name="s3-event-notification-queue",
            policy=queue.json)
        bucket_notification = aws.s3.BucketNotification("bucket_notification",
            bucket=bucket.id,
            queues=[aws.s3.BucketNotificationQueueArgs(
                queue_arn=queue_queue.arn,
                events=["s3:ObjectCreated:*"],
                filter_suffix=".log",
            )])
        ```

        ### Add notification configuration to Lambda Function

        ```python
        import pulumi
        import pulumi_aws as aws

        assume_role = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="Service",
                identifiers=["lambda.amazonaws.com"],
            )],
            actions=["sts:AssumeRole"],
        )])
        iam_for_lambda = aws.iam.Role("iam_for_lambda",
            name="iam_for_lambda",
            assume_role_policy=assume_role.json)
        func = aws.lambda_.Function("func",
            code=pulumi.FileArchive("your-function.zip"),
            name="example_lambda_name",
            role=iam_for_lambda.arn,
            handler="exports.example",
            runtime=aws.lambda_.Runtime.GO1DX)
        bucket = aws.s3.BucketV2("bucket", bucket="your-bucket-name")
        allow_bucket = aws.lambda_.Permission("allow_bucket",
            statement_id="AllowExecutionFromS3Bucket",
            action="lambda:InvokeFunction",
            function=func.arn,
            principal="s3.amazonaws.com",
            source_arn=bucket.arn)
        bucket_notification = aws.s3.BucketNotification("bucket_notification",
            bucket=bucket.id,
            lambda_functions=[aws.s3.BucketNotificationLambdaFunctionArgs(
                lambda_function_arn=func.arn,
                events=["s3:ObjectCreated:*"],
                filter_prefix="AWSLogs/",
                filter_suffix=".log",
            )],
            opts = pulumi.ResourceOptions(depends_on=[allow_bucket]))
        ```

        ### Trigger multiple Lambda functions

        ```python
        import pulumi
        import pulumi_aws as aws

        assume_role = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="Service",
                identifiers=["lambda.amazonaws.com"],
            )],
            actions=["sts:AssumeRole"],
        )])
        iam_for_lambda = aws.iam.Role("iam_for_lambda",
            name="iam_for_lambda",
            assume_role_policy=assume_role.json)
        func1 = aws.lambda_.Function("func1",
            code=pulumi.FileArchive("your-function1.zip"),
            name="example_lambda_name1",
            role=iam_for_lambda.arn,
            handler="exports.example",
            runtime=aws.lambda_.Runtime.GO1DX)
        bucket = aws.s3.BucketV2("bucket", bucket="your-bucket-name")
        allow_bucket1 = aws.lambda_.Permission("allow_bucket1",
            statement_id="AllowExecutionFromS3Bucket1",
            action="lambda:InvokeFunction",
            function=func1.arn,
            principal="s3.amazonaws.com",
            source_arn=bucket.arn)
        func2 = aws.lambda_.Function("func2",
            code=pulumi.FileArchive("your-function2.zip"),
            name="example_lambda_name2",
            role=iam_for_lambda.arn,
            handler="exports.example")
        allow_bucket2 = aws.lambda_.Permission("allow_bucket2",
            statement_id="AllowExecutionFromS3Bucket2",
            action="lambda:InvokeFunction",
            function=func2.arn,
            principal="s3.amazonaws.com",
            source_arn=bucket.arn)
        bucket_notification = aws.s3.BucketNotification("bucket_notification",
            bucket=bucket.id,
            lambda_functions=[
                aws.s3.BucketNotificationLambdaFunctionArgs(
                    lambda_function_arn=func1.arn,
                    events=["s3:ObjectCreated:*"],
                    filter_prefix="AWSLogs/",
                    filter_suffix=".log",
                ),
                aws.s3.BucketNotificationLambdaFunctionArgs(
                    lambda_function_arn=func2.arn,
                    events=["s3:ObjectCreated:*"],
                    filter_prefix="OtherLogs/",
                    filter_suffix=".log",
                ),
            ],
            opts = pulumi.ResourceOptions(depends_on=[
                    allow_bucket1,
                    allow_bucket2,
                ]))
        ```

        ### Add multiple notification configurations to SQS Queue

        ```python
        import pulumi
        import pulumi_aws as aws

        bucket = aws.s3.BucketV2("bucket", bucket="your-bucket-name")
        queue = aws.iam.get_policy_document_output(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="*",
                identifiers=["*"],
            )],
            actions=["sqs:SendMessage"],
            resources=["arn:aws:sqs:*:*:s3-event-notification-queue"],
            conditions=[aws.iam.GetPolicyDocumentStatementConditionArgs(
                test="ArnEquals",
                variable="aws:SourceArn",
                values=[bucket.arn],
            )],
        )])
        queue_queue = aws.sqs.Queue("queue",
            name="s3-event-notification-queue",
            policy=queue.json)
        bucket_notification = aws.s3.BucketNotification("bucket_notification",
            bucket=bucket.id,
            queues=[
                aws.s3.BucketNotificationQueueArgs(
                    id="image-upload-event",
                    queue_arn=queue_queue.arn,
                    events=["s3:ObjectCreated:*"],
                    filter_prefix="images/",
                ),
                aws.s3.BucketNotificationQueueArgs(
                    id="video-upload-event",
                    queue_arn=queue_queue.arn,
                    events=["s3:ObjectCreated:*"],
                    filter_prefix="videos/",
                ),
            ])
        ```

        For JSON syntax, use an array instead of defining the `queue` key twice.

        ### Emit events to EventBridge

        ```python
        import pulumi
        import pulumi_aws as aws

        bucket = aws.s3.BucketV2("bucket", bucket="your-bucket-name")
        bucket_notification = aws.s3.BucketNotification("bucket_notification",
            bucket=bucket.id,
            eventbridge=True)
        ```

        ## Import

        Using `pulumi import`, import S3 bucket notification using the `bucket`. For example:

        ```sh
        $ pulumi import aws:s3/bucketNotification:BucketNotification bucket_notification bucket-name
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] bucket: Name of the bucket for notification configuration.
               
               The following arguments are optional:
        :param pulumi.Input[bool] eventbridge: Whether to enable Amazon EventBridge notifications. Defaults to `false`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BucketNotificationLambdaFunctionArgs']]]] lambda_functions: Used to configure notifications to a Lambda Function. See below.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BucketNotificationQueueArgs']]]] queues: Notification configuration to SQS Queue. See below.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BucketNotificationTopicArgs']]]] topics: Notification configuration to SNS Topic. See below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BucketNotificationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a S3 Bucket Notification Configuration. For additional information, see the [Configuring S3 Event Notifications section in the Amazon S3 Developer Guide](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html).

        > **NOTE:** S3 Buckets only support a single notification configuration. Declaring multiple `s3.BucketNotification` resources to the same S3 Bucket will cause a perpetual difference in configuration. See the example "Trigger multiple Lambda functions" for an option.

        > This resource cannot be used with S3 directory buckets.

        ## Example Usage

        ### Add notification configuration to SNS Topic

        ```python
        import pulumi
        import pulumi_aws as aws

        bucket = aws.s3.BucketV2("bucket", bucket="your-bucket-name")
        topic = aws.iam.get_policy_document_output(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="Service",
                identifiers=["s3.amazonaws.com"],
            )],
            actions=["SNS:Publish"],
            resources=["arn:aws:sns:*:*:s3-event-notification-topic"],
            conditions=[aws.iam.GetPolicyDocumentStatementConditionArgs(
                test="ArnLike",
                variable="aws:SourceArn",
                values=[bucket.arn],
            )],
        )])
        topic_topic = aws.sns.Topic("topic",
            name="s3-event-notification-topic",
            policy=topic.json)
        bucket_notification = aws.s3.BucketNotification("bucket_notification",
            bucket=bucket.id,
            topics=[aws.s3.BucketNotificationTopicArgs(
                topic_arn=topic_topic.arn,
                events=["s3:ObjectCreated:*"],
                filter_suffix=".log",
            )])
        ```

        ### Add notification configuration to SQS Queue

        ```python
        import pulumi
        import pulumi_aws as aws

        bucket = aws.s3.BucketV2("bucket", bucket="your-bucket-name")
        queue = aws.iam.get_policy_document_output(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="*",
                identifiers=["*"],
            )],
            actions=["sqs:SendMessage"],
            resources=["arn:aws:sqs:*:*:s3-event-notification-queue"],
            conditions=[aws.iam.GetPolicyDocumentStatementConditionArgs(
                test="ArnEquals",
                variable="aws:SourceArn",
                values=[bucket.arn],
            )],
        )])
        queue_queue = aws.sqs.Queue("queue",
            name="s3-event-notification-queue",
            policy=queue.json)
        bucket_notification = aws.s3.BucketNotification("bucket_notification",
            bucket=bucket.id,
            queues=[aws.s3.BucketNotificationQueueArgs(
                queue_arn=queue_queue.arn,
                events=["s3:ObjectCreated:*"],
                filter_suffix=".log",
            )])
        ```

        ### Add notification configuration to Lambda Function

        ```python
        import pulumi
        import pulumi_aws as aws

        assume_role = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="Service",
                identifiers=["lambda.amazonaws.com"],
            )],
            actions=["sts:AssumeRole"],
        )])
        iam_for_lambda = aws.iam.Role("iam_for_lambda",
            name="iam_for_lambda",
            assume_role_policy=assume_role.json)
        func = aws.lambda_.Function("func",
            code=pulumi.FileArchive("your-function.zip"),
            name="example_lambda_name",
            role=iam_for_lambda.arn,
            handler="exports.example",
            runtime=aws.lambda_.Runtime.GO1DX)
        bucket = aws.s3.BucketV2("bucket", bucket="your-bucket-name")
        allow_bucket = aws.lambda_.Permission("allow_bucket",
            statement_id="AllowExecutionFromS3Bucket",
            action="lambda:InvokeFunction",
            function=func.arn,
            principal="s3.amazonaws.com",
            source_arn=bucket.arn)
        bucket_notification = aws.s3.BucketNotification("bucket_notification",
            bucket=bucket.id,
            lambda_functions=[aws.s3.BucketNotificationLambdaFunctionArgs(
                lambda_function_arn=func.arn,
                events=["s3:ObjectCreated:*"],
                filter_prefix="AWSLogs/",
                filter_suffix=".log",
            )],
            opts = pulumi.ResourceOptions(depends_on=[allow_bucket]))
        ```

        ### Trigger multiple Lambda functions

        ```python
        import pulumi
        import pulumi_aws as aws

        assume_role = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="Service",
                identifiers=["lambda.amazonaws.com"],
            )],
            actions=["sts:AssumeRole"],
        )])
        iam_for_lambda = aws.iam.Role("iam_for_lambda",
            name="iam_for_lambda",
            assume_role_policy=assume_role.json)
        func1 = aws.lambda_.Function("func1",
            code=pulumi.FileArchive("your-function1.zip"),
            name="example_lambda_name1",
            role=iam_for_lambda.arn,
            handler="exports.example",
            runtime=aws.lambda_.Runtime.GO1DX)
        bucket = aws.s3.BucketV2("bucket", bucket="your-bucket-name")
        allow_bucket1 = aws.lambda_.Permission("allow_bucket1",
            statement_id="AllowExecutionFromS3Bucket1",
            action="lambda:InvokeFunction",
            function=func1.arn,
            principal="s3.amazonaws.com",
            source_arn=bucket.arn)
        func2 = aws.lambda_.Function("func2",
            code=pulumi.FileArchive("your-function2.zip"),
            name="example_lambda_name2",
            role=iam_for_lambda.arn,
            handler="exports.example")
        allow_bucket2 = aws.lambda_.Permission("allow_bucket2",
            statement_id="AllowExecutionFromS3Bucket2",
            action="lambda:InvokeFunction",
            function=func2.arn,
            principal="s3.amazonaws.com",
            source_arn=bucket.arn)
        bucket_notification = aws.s3.BucketNotification("bucket_notification",
            bucket=bucket.id,
            lambda_functions=[
                aws.s3.BucketNotificationLambdaFunctionArgs(
                    lambda_function_arn=func1.arn,
                    events=["s3:ObjectCreated:*"],
                    filter_prefix="AWSLogs/",
                    filter_suffix=".log",
                ),
                aws.s3.BucketNotificationLambdaFunctionArgs(
                    lambda_function_arn=func2.arn,
                    events=["s3:ObjectCreated:*"],
                    filter_prefix="OtherLogs/",
                    filter_suffix=".log",
                ),
            ],
            opts = pulumi.ResourceOptions(depends_on=[
                    allow_bucket1,
                    allow_bucket2,
                ]))
        ```

        ### Add multiple notification configurations to SQS Queue

        ```python
        import pulumi
        import pulumi_aws as aws

        bucket = aws.s3.BucketV2("bucket", bucket="your-bucket-name")
        queue = aws.iam.get_policy_document_output(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="*",
                identifiers=["*"],
            )],
            actions=["sqs:SendMessage"],
            resources=["arn:aws:sqs:*:*:s3-event-notification-queue"],
            conditions=[aws.iam.GetPolicyDocumentStatementConditionArgs(
                test="ArnEquals",
                variable="aws:SourceArn",
                values=[bucket.arn],
            )],
        )])
        queue_queue = aws.sqs.Queue("queue",
            name="s3-event-notification-queue",
            policy=queue.json)
        bucket_notification = aws.s3.BucketNotification("bucket_notification",
            bucket=bucket.id,
            queues=[
                aws.s3.BucketNotificationQueueArgs(
                    id="image-upload-event",
                    queue_arn=queue_queue.arn,
                    events=["s3:ObjectCreated:*"],
                    filter_prefix="images/",
                ),
                aws.s3.BucketNotificationQueueArgs(
                    id="video-upload-event",
                    queue_arn=queue_queue.arn,
                    events=["s3:ObjectCreated:*"],
                    filter_prefix="videos/",
                ),
            ])
        ```

        For JSON syntax, use an array instead of defining the `queue` key twice.

        ### Emit events to EventBridge

        ```python
        import pulumi
        import pulumi_aws as aws

        bucket = aws.s3.BucketV2("bucket", bucket="your-bucket-name")
        bucket_notification = aws.s3.BucketNotification("bucket_notification",
            bucket=bucket.id,
            eventbridge=True)
        ```

        ## Import

        Using `pulumi import`, import S3 bucket notification using the `bucket`. For example:

        ```sh
        $ pulumi import aws:s3/bucketNotification:BucketNotification bucket_notification bucket-name
        ```

        :param str resource_name: The name of the resource.
        :param BucketNotificationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BucketNotificationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 eventbridge: Optional[pulumi.Input[bool]] = None,
                 lambda_functions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BucketNotificationLambdaFunctionArgs']]]]] = None,
                 queues: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BucketNotificationQueueArgs']]]]] = None,
                 topics: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BucketNotificationTopicArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BucketNotificationArgs.__new__(BucketNotificationArgs)

            if bucket is None and not opts.urn:
                raise TypeError("Missing required property 'bucket'")
            __props__.__dict__["bucket"] = bucket
            __props__.__dict__["eventbridge"] = eventbridge
            __props__.__dict__["lambda_functions"] = lambda_functions
            __props__.__dict__["queues"] = queues
            __props__.__dict__["topics"] = topics
        super(BucketNotification, __self__).__init__(
            'aws:s3/bucketNotification:BucketNotification',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bucket: Optional[pulumi.Input[str]] = None,
            eventbridge: Optional[pulumi.Input[bool]] = None,
            lambda_functions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BucketNotificationLambdaFunctionArgs']]]]] = None,
            queues: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BucketNotificationQueueArgs']]]]] = None,
            topics: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BucketNotificationTopicArgs']]]]] = None) -> 'BucketNotification':
        """
        Get an existing BucketNotification resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] bucket: Name of the bucket for notification configuration.
               
               The following arguments are optional:
        :param pulumi.Input[bool] eventbridge: Whether to enable Amazon EventBridge notifications. Defaults to `false`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BucketNotificationLambdaFunctionArgs']]]] lambda_functions: Used to configure notifications to a Lambda Function. See below.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BucketNotificationQueueArgs']]]] queues: Notification configuration to SQS Queue. See below.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BucketNotificationTopicArgs']]]] topics: Notification configuration to SNS Topic. See below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BucketNotificationState.__new__(_BucketNotificationState)

        __props__.__dict__["bucket"] = bucket
        __props__.__dict__["eventbridge"] = eventbridge
        __props__.__dict__["lambda_functions"] = lambda_functions
        __props__.__dict__["queues"] = queues
        __props__.__dict__["topics"] = topics
        return BucketNotification(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def bucket(self) -> pulumi.Output[str]:
        """
        Name of the bucket for notification configuration.

        The following arguments are optional:
        """
        return pulumi.get(self, "bucket")

    @property
    @pulumi.getter
    def eventbridge(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether to enable Amazon EventBridge notifications. Defaults to `false`.
        """
        return pulumi.get(self, "eventbridge")

    @property
    @pulumi.getter(name="lambdaFunctions")
    def lambda_functions(self) -> pulumi.Output[Optional[Sequence['outputs.BucketNotificationLambdaFunction']]]:
        """
        Used to configure notifications to a Lambda Function. See below.
        """
        return pulumi.get(self, "lambda_functions")

    @property
    @pulumi.getter
    def queues(self) -> pulumi.Output[Optional[Sequence['outputs.BucketNotificationQueue']]]:
        """
        Notification configuration to SQS Queue. See below.
        """
        return pulumi.get(self, "queues")

    @property
    @pulumi.getter
    def topics(self) -> pulumi.Output[Optional[Sequence['outputs.BucketNotificationTopic']]]:
        """
        Notification configuration to SNS Topic. See below.
        """
        return pulumi.get(self, "topics")

