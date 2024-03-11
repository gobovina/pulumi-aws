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

__all__ = ['DomainSamlOptionsArgs', 'DomainSamlOptions']

@pulumi.input_type
class DomainSamlOptionsArgs:
    def __init__(__self__, *,
                 domain_name: pulumi.Input[str],
                 saml_options: Optional[pulumi.Input['DomainSamlOptionsSamlOptionsArgs']] = None):
        """
        The set of arguments for constructing a DomainSamlOptions resource.
        :param pulumi.Input[str] domain_name: Name of the domain.
               
               The following arguments are optional:
        :param pulumi.Input['DomainSamlOptionsSamlOptionsArgs'] saml_options: SAML authentication options for an AWS OpenSearch Domain.
        """
        pulumi.set(__self__, "domain_name", domain_name)
        if saml_options is not None:
            pulumi.set(__self__, "saml_options", saml_options)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Input[str]:
        """
        Name of the domain.

        The following arguments are optional:
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter(name="samlOptions")
    def saml_options(self) -> Optional[pulumi.Input['DomainSamlOptionsSamlOptionsArgs']]:
        """
        SAML authentication options for an AWS OpenSearch Domain.
        """
        return pulumi.get(self, "saml_options")

    @saml_options.setter
    def saml_options(self, value: Optional[pulumi.Input['DomainSamlOptionsSamlOptionsArgs']]):
        pulumi.set(self, "saml_options", value)


@pulumi.input_type
class _DomainSamlOptionsState:
    def __init__(__self__, *,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 saml_options: Optional[pulumi.Input['DomainSamlOptionsSamlOptionsArgs']] = None):
        """
        Input properties used for looking up and filtering DomainSamlOptions resources.
        :param pulumi.Input[str] domain_name: Name of the domain.
               
               The following arguments are optional:
        :param pulumi.Input['DomainSamlOptionsSamlOptionsArgs'] saml_options: SAML authentication options for an AWS OpenSearch Domain.
        """
        if domain_name is not None:
            pulumi.set(__self__, "domain_name", domain_name)
        if saml_options is not None:
            pulumi.set(__self__, "saml_options", saml_options)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the domain.

        The following arguments are optional:
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter(name="samlOptions")
    def saml_options(self) -> Optional[pulumi.Input['DomainSamlOptionsSamlOptionsArgs']]:
        """
        SAML authentication options for an AWS OpenSearch Domain.
        """
        return pulumi.get(self, "saml_options")

    @saml_options.setter
    def saml_options(self, value: Optional[pulumi.Input['DomainSamlOptionsSamlOptionsArgs']]):
        pulumi.set(self, "saml_options", value)


class DomainSamlOptions(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 saml_options: Optional[pulumi.Input[pulumi.InputType['DomainSamlOptionsSamlOptionsArgs']]] = None,
                 __props__=None):
        """
        Manages SAML authentication options for an AWS OpenSearch Domain.

        ## Example Usage

        ### Basic Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws
        import pulumi_std as std

        example = aws.opensearch.Domain("example",
            domain_name="example",
            engine_version="OpenSearch_1.1",
            cluster_config=aws.opensearch.DomainClusterConfigArgs(
                instance_type="r4.large.search",
            ),
            snapshot_options=aws.opensearch.DomainSnapshotOptionsArgs(
                automated_snapshot_start_hour=23,
            ),
            tags={
                "Domain": "TestDomain",
            })
        example_domain_saml_options = aws.opensearch.DomainSamlOptions("example",
            domain_name=example.domain_name,
            saml_options=aws.opensearch.DomainSamlOptionsSamlOptionsArgs(
                enabled=True,
                idp=aws.opensearch.DomainSamlOptionsSamlOptionsIdpArgs(
                    entity_id="https://example.com",
                    metadata_content=std.file(input="./saml-metadata.xml").result,
                ),
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import OpenSearch domains using the `domain_name`. For example:

        ```sh
        $ pulumi import aws:opensearch/domainSamlOptions:DomainSamlOptions example domain_name
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain_name: Name of the domain.
               
               The following arguments are optional:
        :param pulumi.Input[pulumi.InputType['DomainSamlOptionsSamlOptionsArgs']] saml_options: SAML authentication options for an AWS OpenSearch Domain.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DomainSamlOptionsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages SAML authentication options for an AWS OpenSearch Domain.

        ## Example Usage

        ### Basic Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws
        import pulumi_std as std

        example = aws.opensearch.Domain("example",
            domain_name="example",
            engine_version="OpenSearch_1.1",
            cluster_config=aws.opensearch.DomainClusterConfigArgs(
                instance_type="r4.large.search",
            ),
            snapshot_options=aws.opensearch.DomainSnapshotOptionsArgs(
                automated_snapshot_start_hour=23,
            ),
            tags={
                "Domain": "TestDomain",
            })
        example_domain_saml_options = aws.opensearch.DomainSamlOptions("example",
            domain_name=example.domain_name,
            saml_options=aws.opensearch.DomainSamlOptionsSamlOptionsArgs(
                enabled=True,
                idp=aws.opensearch.DomainSamlOptionsSamlOptionsIdpArgs(
                    entity_id="https://example.com",
                    metadata_content=std.file(input="./saml-metadata.xml").result,
                ),
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import OpenSearch domains using the `domain_name`. For example:

        ```sh
        $ pulumi import aws:opensearch/domainSamlOptions:DomainSamlOptions example domain_name
        ```

        :param str resource_name: The name of the resource.
        :param DomainSamlOptionsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DomainSamlOptionsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 saml_options: Optional[pulumi.Input[pulumi.InputType['DomainSamlOptionsSamlOptionsArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DomainSamlOptionsArgs.__new__(DomainSamlOptionsArgs)

            if domain_name is None and not opts.urn:
                raise TypeError("Missing required property 'domain_name'")
            __props__.__dict__["domain_name"] = domain_name
            __props__.__dict__["saml_options"] = saml_options
        super(DomainSamlOptions, __self__).__init__(
            'aws:opensearch/domainSamlOptions:DomainSamlOptions',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            domain_name: Optional[pulumi.Input[str]] = None,
            saml_options: Optional[pulumi.Input[pulumi.InputType['DomainSamlOptionsSamlOptionsArgs']]] = None) -> 'DomainSamlOptions':
        """
        Get an existing DomainSamlOptions resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain_name: Name of the domain.
               
               The following arguments are optional:
        :param pulumi.Input[pulumi.InputType['DomainSamlOptionsSamlOptionsArgs']] saml_options: SAML authentication options for an AWS OpenSearch Domain.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DomainSamlOptionsState.__new__(_DomainSamlOptionsState)

        __props__.__dict__["domain_name"] = domain_name
        __props__.__dict__["saml_options"] = saml_options
        return DomainSamlOptions(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Output[str]:
        """
        Name of the domain.

        The following arguments are optional:
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter(name="samlOptions")
    def saml_options(self) -> pulumi.Output[Optional['outputs.DomainSamlOptionsSamlOptions']]:
        """
        SAML authentication options for an AWS OpenSearch Domain.
        """
        return pulumi.get(self, "saml_options")

