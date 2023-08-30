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

__all__ = ['UsagePlanArgs', 'UsagePlan']

@pulumi.input_type
class UsagePlanArgs:
    def __init__(__self__, *,
                 api_stages: Optional[pulumi.Input[Sequence[pulumi.Input['UsagePlanApiStageArgs']]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 product_code: Optional[pulumi.Input[str]] = None,
                 quota_settings: Optional[pulumi.Input['UsagePlanQuotaSettingsArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 throttle_settings: Optional[pulumi.Input['UsagePlanThrottleSettingsArgs']] = None):
        """
        The set of arguments for constructing a UsagePlan resource.
        :param pulumi.Input[Sequence[pulumi.Input['UsagePlanApiStageArgs']]] api_stages: Associated API stages of the usage plan.
        :param pulumi.Input[str] description: Description of a usage plan.
        :param pulumi.Input[str] name: Name of the usage plan.
        :param pulumi.Input[str] product_code: AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
        :param pulumi.Input['UsagePlanQuotaSettingsArgs'] quota_settings: The quota settings of the usage plan.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input['UsagePlanThrottleSettingsArgs'] throttle_settings: The throttling limits of the usage plan.
        """
        if api_stages is not None:
            pulumi.set(__self__, "api_stages", api_stages)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if product_code is not None:
            pulumi.set(__self__, "product_code", product_code)
        if quota_settings is not None:
            pulumi.set(__self__, "quota_settings", quota_settings)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if throttle_settings is not None:
            pulumi.set(__self__, "throttle_settings", throttle_settings)

    @property
    @pulumi.getter(name="apiStages")
    def api_stages(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['UsagePlanApiStageArgs']]]]:
        """
        Associated API stages of the usage plan.
        """
        return pulumi.get(self, "api_stages")

    @api_stages.setter
    def api_stages(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['UsagePlanApiStageArgs']]]]):
        pulumi.set(self, "api_stages", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of a usage plan.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the usage plan.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="productCode")
    def product_code(self) -> Optional[pulumi.Input[str]]:
        """
        AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
        """
        return pulumi.get(self, "product_code")

    @product_code.setter
    def product_code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "product_code", value)

    @property
    @pulumi.getter(name="quotaSettings")
    def quota_settings(self) -> Optional[pulumi.Input['UsagePlanQuotaSettingsArgs']]:
        """
        The quota settings of the usage plan.
        """
        return pulumi.get(self, "quota_settings")

    @quota_settings.setter
    def quota_settings(self, value: Optional[pulumi.Input['UsagePlanQuotaSettingsArgs']]):
        pulumi.set(self, "quota_settings", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="throttleSettings")
    def throttle_settings(self) -> Optional[pulumi.Input['UsagePlanThrottleSettingsArgs']]:
        """
        The throttling limits of the usage plan.
        """
        return pulumi.get(self, "throttle_settings")

    @throttle_settings.setter
    def throttle_settings(self, value: Optional[pulumi.Input['UsagePlanThrottleSettingsArgs']]):
        pulumi.set(self, "throttle_settings", value)


@pulumi.input_type
class _UsagePlanState:
    def __init__(__self__, *,
                 api_stages: Optional[pulumi.Input[Sequence[pulumi.Input['UsagePlanApiStageArgs']]]] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 product_code: Optional[pulumi.Input[str]] = None,
                 quota_settings: Optional[pulumi.Input['UsagePlanQuotaSettingsArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 throttle_settings: Optional[pulumi.Input['UsagePlanThrottleSettingsArgs']] = None):
        """
        Input properties used for looking up and filtering UsagePlan resources.
        :param pulumi.Input[Sequence[pulumi.Input['UsagePlanApiStageArgs']]] api_stages: Associated API stages of the usage plan.
        :param pulumi.Input[str] arn: ARN
        :param pulumi.Input[str] description: Description of a usage plan.
        :param pulumi.Input[str] name: Name of the usage plan.
        :param pulumi.Input[str] product_code: AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
        :param pulumi.Input['UsagePlanQuotaSettingsArgs'] quota_settings: The quota settings of the usage plan.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input['UsagePlanThrottleSettingsArgs'] throttle_settings: The throttling limits of the usage plan.
        """
        if api_stages is not None:
            pulumi.set(__self__, "api_stages", api_stages)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if product_code is not None:
            pulumi.set(__self__, "product_code", product_code)
        if quota_settings is not None:
            pulumi.set(__self__, "quota_settings", quota_settings)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if throttle_settings is not None:
            pulumi.set(__self__, "throttle_settings", throttle_settings)

    @property
    @pulumi.getter(name="apiStages")
    def api_stages(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['UsagePlanApiStageArgs']]]]:
        """
        Associated API stages of the usage plan.
        """
        return pulumi.get(self, "api_stages")

    @api_stages.setter
    def api_stages(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['UsagePlanApiStageArgs']]]]):
        pulumi.set(self, "api_stages", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of a usage plan.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the usage plan.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="productCode")
    def product_code(self) -> Optional[pulumi.Input[str]]:
        """
        AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
        """
        return pulumi.get(self, "product_code")

    @product_code.setter
    def product_code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "product_code", value)

    @property
    @pulumi.getter(name="quotaSettings")
    def quota_settings(self) -> Optional[pulumi.Input['UsagePlanQuotaSettingsArgs']]:
        """
        The quota settings of the usage plan.
        """
        return pulumi.get(self, "quota_settings")

    @quota_settings.setter
    def quota_settings(self, value: Optional[pulumi.Input['UsagePlanQuotaSettingsArgs']]):
        pulumi.set(self, "quota_settings", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter(name="throttleSettings")
    def throttle_settings(self) -> Optional[pulumi.Input['UsagePlanThrottleSettingsArgs']]:
        """
        The throttling limits of the usage plan.
        """
        return pulumi.get(self, "throttle_settings")

    @throttle_settings.setter
    def throttle_settings(self, value: Optional[pulumi.Input['UsagePlanThrottleSettingsArgs']]):
        pulumi.set(self, "throttle_settings", value)


class UsagePlan(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_stages: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UsagePlanApiStageArgs']]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 product_code: Optional[pulumi.Input[str]] = None,
                 quota_settings: Optional[pulumi.Input[pulumi.InputType['UsagePlanQuotaSettingsArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 throttle_settings: Optional[pulumi.Input[pulumi.InputType['UsagePlanThrottleSettingsArgs']]] = None,
                 __props__=None):
        """
        Provides an API Gateway Usage Plan.

        ## Example Usage

        ```python
        import pulumi
        import hashlib
        import json
        import pulumi_aws as aws

        example_rest_api = aws.apigateway.RestApi("exampleRestApi", body=json.dumps({
            "openapi": "3.0.1",
            "info": {
                "title": "example",
                "version": "1.0",
            },
            "paths": {
                "/path1": {
                    "get": {
                        "x-amazon-apigateway-integration": {
                            "httpMethod": "GET",
                            "payloadFormatVersion": "1.0",
                            "type": "HTTP_PROXY",
                            "uri": "https://ip-ranges.amazonaws.com/ip-ranges.json",
                        },
                    },
                },
            },
        }))
        example_deployment = aws.apigateway.Deployment("exampleDeployment",
            rest_api=example_rest_api.id,
            triggers={
                "redeployment": example_rest_api.body.apply(lambda body: json.dumps(body)).apply(lambda to_json: hashlib.sha1(to_json.encode()).hexdigest()),
            })
        development = aws.apigateway.Stage("development",
            deployment=example_deployment.id,
            rest_api=example_rest_api.id,
            stage_name="development")
        production = aws.apigateway.Stage("production",
            deployment=example_deployment.id,
            rest_api=example_rest_api.id,
            stage_name="production")
        example_usage_plan = aws.apigateway.UsagePlan("exampleUsagePlan",
            description="my description",
            product_code="MYCODE",
            api_stages=[
                aws.apigateway.UsagePlanApiStageArgs(
                    api_id=example_rest_api.id,
                    stage=development.stage_name,
                ),
                aws.apigateway.UsagePlanApiStageArgs(
                    api_id=example_rest_api.id,
                    stage=production.stage_name,
                ),
            ],
            quota_settings=aws.apigateway.UsagePlanQuotaSettingsArgs(
                limit=20,
                offset=2,
                period="WEEK",
            ),
            throttle_settings=aws.apigateway.UsagePlanThrottleSettingsArgs(
                burst_limit=5,
                rate_limit=10,
            ))
        ```

        ## Import

        Using `pulumi import`, import AWS API Gateway Usage Plan using the `id`. For example:

        ```sh
         $ pulumi import aws:apigateway/usagePlan:UsagePlan myusageplan <usage_plan_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UsagePlanApiStageArgs']]]] api_stages: Associated API stages of the usage plan.
        :param pulumi.Input[str] description: Description of a usage plan.
        :param pulumi.Input[str] name: Name of the usage plan.
        :param pulumi.Input[str] product_code: AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
        :param pulumi.Input[pulumi.InputType['UsagePlanQuotaSettingsArgs']] quota_settings: The quota settings of the usage plan.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[pulumi.InputType['UsagePlanThrottleSettingsArgs']] throttle_settings: The throttling limits of the usage plan.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[UsagePlanArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an API Gateway Usage Plan.

        ## Example Usage

        ```python
        import pulumi
        import hashlib
        import json
        import pulumi_aws as aws

        example_rest_api = aws.apigateway.RestApi("exampleRestApi", body=json.dumps({
            "openapi": "3.0.1",
            "info": {
                "title": "example",
                "version": "1.0",
            },
            "paths": {
                "/path1": {
                    "get": {
                        "x-amazon-apigateway-integration": {
                            "httpMethod": "GET",
                            "payloadFormatVersion": "1.0",
                            "type": "HTTP_PROXY",
                            "uri": "https://ip-ranges.amazonaws.com/ip-ranges.json",
                        },
                    },
                },
            },
        }))
        example_deployment = aws.apigateway.Deployment("exampleDeployment",
            rest_api=example_rest_api.id,
            triggers={
                "redeployment": example_rest_api.body.apply(lambda body: json.dumps(body)).apply(lambda to_json: hashlib.sha1(to_json.encode()).hexdigest()),
            })
        development = aws.apigateway.Stage("development",
            deployment=example_deployment.id,
            rest_api=example_rest_api.id,
            stage_name="development")
        production = aws.apigateway.Stage("production",
            deployment=example_deployment.id,
            rest_api=example_rest_api.id,
            stage_name="production")
        example_usage_plan = aws.apigateway.UsagePlan("exampleUsagePlan",
            description="my description",
            product_code="MYCODE",
            api_stages=[
                aws.apigateway.UsagePlanApiStageArgs(
                    api_id=example_rest_api.id,
                    stage=development.stage_name,
                ),
                aws.apigateway.UsagePlanApiStageArgs(
                    api_id=example_rest_api.id,
                    stage=production.stage_name,
                ),
            ],
            quota_settings=aws.apigateway.UsagePlanQuotaSettingsArgs(
                limit=20,
                offset=2,
                period="WEEK",
            ),
            throttle_settings=aws.apigateway.UsagePlanThrottleSettingsArgs(
                burst_limit=5,
                rate_limit=10,
            ))
        ```

        ## Import

        Using `pulumi import`, import AWS API Gateway Usage Plan using the `id`. For example:

        ```sh
         $ pulumi import aws:apigateway/usagePlan:UsagePlan myusageplan <usage_plan_id>
        ```

        :param str resource_name: The name of the resource.
        :param UsagePlanArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UsagePlanArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_stages: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UsagePlanApiStageArgs']]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 product_code: Optional[pulumi.Input[str]] = None,
                 quota_settings: Optional[pulumi.Input[pulumi.InputType['UsagePlanQuotaSettingsArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 throttle_settings: Optional[pulumi.Input[pulumi.InputType['UsagePlanThrottleSettingsArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UsagePlanArgs.__new__(UsagePlanArgs)

            __props__.__dict__["api_stages"] = api_stages
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["product_code"] = product_code
            __props__.__dict__["quota_settings"] = quota_settings
            __props__.__dict__["tags"] = tags
            __props__.__dict__["throttle_settings"] = throttle_settings
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(UsagePlan, __self__).__init__(
            'aws:apigateway/usagePlan:UsagePlan',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_stages: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UsagePlanApiStageArgs']]]]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            product_code: Optional[pulumi.Input[str]] = None,
            quota_settings: Optional[pulumi.Input[pulumi.InputType['UsagePlanQuotaSettingsArgs']]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            throttle_settings: Optional[pulumi.Input[pulumi.InputType['UsagePlanThrottleSettingsArgs']]] = None) -> 'UsagePlan':
        """
        Get an existing UsagePlan resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UsagePlanApiStageArgs']]]] api_stages: Associated API stages of the usage plan.
        :param pulumi.Input[str] arn: ARN
        :param pulumi.Input[str] description: Description of a usage plan.
        :param pulumi.Input[str] name: Name of the usage plan.
        :param pulumi.Input[str] product_code: AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
        :param pulumi.Input[pulumi.InputType['UsagePlanQuotaSettingsArgs']] quota_settings: The quota settings of the usage plan.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[pulumi.InputType['UsagePlanThrottleSettingsArgs']] throttle_settings: The throttling limits of the usage plan.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UsagePlanState.__new__(_UsagePlanState)

        __props__.__dict__["api_stages"] = api_stages
        __props__.__dict__["arn"] = arn
        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["product_code"] = product_code
        __props__.__dict__["quota_settings"] = quota_settings
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["throttle_settings"] = throttle_settings
        return UsagePlan(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiStages")
    def api_stages(self) -> pulumi.Output[Optional[Sequence['outputs.UsagePlanApiStage']]]:
        """
        Associated API stages of the usage plan.
        """
        return pulumi.get(self, "api_stages")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of a usage plan.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the usage plan.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="productCode")
    def product_code(self) -> pulumi.Output[Optional[str]]:
        """
        AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
        """
        return pulumi.get(self, "product_code")

    @property
    @pulumi.getter(name="quotaSettings")
    def quota_settings(self) -> pulumi.Output[Optional['outputs.UsagePlanQuotaSettings']]:
        """
        The quota settings of the usage plan.
        """
        return pulumi.get(self, "quota_settings")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter(name="throttleSettings")
    def throttle_settings(self) -> pulumi.Output[Optional['outputs.UsagePlanThrottleSettings']]:
        """
        The throttling limits of the usage plan.
        """
        return pulumi.get(self, "throttle_settings")

